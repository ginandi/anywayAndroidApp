import re, urllib2

number_tabs = 0
buff = []
def print_out(str=''):
	buff.append(('\t' * number_tabs) + str)

name_regex = re.compile('\s+\"([A-Z_]+)\":\s+{.*')
# value_regex = re.compile('\s+(\d+):\s+\"(.*)\",.*')
value_regex = re.compile('\s+\"(\d+)\"\s*:\s+\"(.*)\",.*')

localized_names_regex = re.compile('\s+.*\"([A-Z_]+[0-9]*)\":\s+\"(.*)\".*')

print_out('package il.co.anyway.app.models;')
print_out()
print_out('import java.util.HashMap;')
print_out('import java.util.Map;')
print_out()
print_out('/** Generated file, do not modify manually **/')
print_out()
print_out('public class Localization {')
number_tabs = number_tabs + 1
print_out('public static Map<String, HashMap<Integer, String>> values = new HashMap<>();')
print_out('public static Map<String, String> localizedNames = new HashMap<>();')
print_out('static {')
number_tabs = number_tabs + 1
lines = urllib2 .urlopen('https://raw.githubusercontent.com/hasadna/anyway/dev/static/js/localization.js')
first = True
for line in lines:
	name_match = name_regex.match(line)
	if (name_match):
		name = name_match.group(1)
		if (first):
			first = False
		else:
			print_out("}}); ")
		print_out('values.put("' + name + '", new HashMap<Integer, String>() {{')

	value_match = value_regex.match(line)
	if (value_match):
		index = value_match.group(1)
		name = value_match.group(2)
		number_tabs = number_tabs + 1
		print_out('put(' + index + ', "' + name + '");' )
		number_tabs = number_tabs - 1

print_out("}}); ")
number_tabs = number_tabs - 1

lines = urllib2.urlopen('https://raw.githubusercontent.com/hasadna/anyway/dev/static/js/localization.js')
for line in lines:
	localized_name_match = localized_names_regex.match(line)
	if (localized_name_match):
		unlocalized= localized_name_match.group(1)
		localized = localized_name_match.group(2)
		print_out('localizedNames.put("' + unlocalized + '", "' + localized + '");')


print_out('}')

number_tabs = number_tabs - 1
print_out('}')

with open("../app/src/main/java/il/co/anyway/app/models/Localization.java", "w") as text_file:
	text_file.write('\n'.join(buff))
	text_file.close()