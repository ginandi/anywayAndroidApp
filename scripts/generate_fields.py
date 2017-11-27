import re, urllib2

line_regex = re.compile('\s*([a-z0-9_]+).*\"([A-Z_]+)\".*')

number_tabs = 0
buff = []
def print_out(str=''):
	# print ('\t' * number_tabs) + str
	buff.append(('\t' * number_tabs) + str)

print_out('package il.co.anyway.app.models;')
print_out()
print_out('import java.util.HashMap;')
print_out('import java.util.Map;')
print_out()
print_out('/** Generated file, do not modify manually **/')
print_out()
print_out('public class FieldNames {')
number_tabs = number_tabs + 1
print_out('public static Map<String, String> map = new HashMap<>();')
print_out('static {')
number_tabs = number_tabs + 1

lines = urllib2.urlopen('https://raw.githubusercontent.com/hasadna/anyway/dev/anyway/field_names.py')
for line in lines:
	field_match = line_regex.match(line)
	if (field_match):
		field_name = field_match.group(1)
		field_value = field_match.group(2)
		print_out('map.put("' + field_name + '", "' + field_value + '");')

number_tabs = number_tabs - 1
print_out('}')
number_tabs = number_tabs - 1
print_out('}')

with open("../app/src/main/java/il/co/anyway/app/models/FieldNames.java", "w") as text_file:
	text_file.write('\n'.join(buff))
	text_file.close()
