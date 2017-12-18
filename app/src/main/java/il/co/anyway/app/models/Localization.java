package il.co.anyway.app.models;

import java.util.HashMap;
import java.util.Map;

/** Generated file, do not modify manually **/

public class Localization {
	public static Map<String, HashMap<Integer, String>> values = new HashMap<>();
	public static Map<String, String> localizedNames = new HashMap<>();
	static {
		values.put("SUG_DEREH", new HashMap<Integer, String>() {{
			put(1, "עירוני בצומת");
			put(2, "עירוני לא בצומת");
			put(3, "לא עירוני בצומת");
		}}); 
		values.put("YEHIDA", new HashMap<Integer, String>() {{
			put(11, "מרחב חוף (חיפה)");
			put(12, "מרחב גליל");
			put(14, "מרחב עמקים");
			put(20, "מרחב ת\"א");
			put(33, "מרחב אילת");
			put(34, "מרחב הנגב");
			put(36, "מרחב שמשון (עד 1999)");
			put(37, "מרחב שמשון (החל ב-2004)");
			put(38, "מרחב לכיש");
			put(41, "מרחב שומרון");
			put(43, "מרחב יהודה");
			put(51, "מרחב השרון");
			put(52, "מרחב השפלה");
		}}); 
		values.put("SUG_YOM", new HashMap<Integer, String>() {{
			put(1, "חג");
			put(2, "ערב חג");
			put(3, "חול המועד");
			put(4, "יום אחר");
		}}); 
		values.put("HUMRAT_TEUNA", new HashMap<Integer, String>() {{
			put(1, "קטלנית");
			put(2, "קשה");
			put(3, "קלה");
		}}); 
		values.put("SUG_TEUNA", new HashMap<Integer, String>() {{
			put(1, "פגיעה בהולך רגל");
			put(2, "התנגשות חזית אל צד");
			put(3, "התנגשות חזית באחור");
			put(4, "התנגשות צד בצד");
			put(5, "התנגשות חזית אל חזית");
			put(6, "התנגשות עם רכב שנעצר ללא חניה");
			put(7, "התנגשות עם רכב חונה");
			put(8, "התנגשות עם עצם דומם");
			put(9, "ירידה מהכביש או עלייה למדרכה");
			put(10, "התהפכות");
			put(11, "החלקה");
			put(12, "פגיעה בנוסע בתוך כלי רכב");
			put(13, "נפילה ברכב נע");
			put(14, "שריפה");
			put(15, "אחר");
			put(17, "התנגשות אחור אל חזית");
			put(18, "התנגשות אחור אל צד");
			put(19, "התנגשות עם בעל חיים");
			put(20, "פגיעה ממטען של רכב");
			put(21, "איחוד הצלה");
		}}); 
		values.put("ZURAT_DEREH", new HashMap<Integer, String>() {{
			put(1, "כניסה למחלף");
			put(2, "ביציאה ממחלף");
			put(3, "מ.חניה/ת. דלק");
			put(4, "שיפוע תלול");
			put(5, "עקום חד");
			put(6, "על גשר מנהרה");
			put(7, "מפגש מסילת ברזל");
			put(8, "כביש ישר/צומת");
			put(9, "אחר");
		}}); 
		values.put("HAD_MASLUL", new HashMap<Integer, String>() {{
			put(1, "חד סיטרי");
			put(2, "דו סיטרי+קו הפרדה רצוף");
			put(3, "דו סיטרי אין קו הפרדה רצוף");
			put(4, "אחר");
		}}); 
		values.put("RAV_MASLUL", new HashMap<Integer, String>() {{
			put(1, "מיפרדה מסומנת בצבע");
			put(2, "מיפרדה עם גדר בטיחות");
			put(3, "מיפרדה בנויה ללא גדר בטיחות");
			put(4, "מיפרדה לא בנויה");
			put(5, "אחר");
		}}); 
		values.put("MEHIRUT_MUTERET", new HashMap<Integer, String>() {{
			put(1, "עד 50 קמ\"ש");
			put(2, "60 קמ\"ש");
			put(3, "70 קמ\"ש");
			put(4, "80 קמ\"ש");
			put(5, "90 קמ\"ש");
			put(6, "100 קמ\"ש");
		}}); 
		values.put("TKINUT", new HashMap<Integer, String>() {{
			put(1, "אין ליקוי");
			put(2, "שוליים גרועים");
			put(3, "כביש משובש");
			put(4, "שוליים גרועים וכביש משובש");
		}}); 
		values.put("ROHAV", new HashMap<Integer, String>() {{
			put(1, "עד 5 מטר");
			put(2, "5 עד 7");
			put(3, "7 עד 10.5");
			put(4, "10.5 עד 14");
			put(5, "יותר מ-14");
		}}); 
		values.put("SIMUN_TIMRUR", new HashMap<Integer, String>() {{
			put(1, "סימון לקוי/חסר");
			put(2, "תימרור לקוי/חסר");
			put(3, "אין ליקוי");
			put(4, "לא נדרש תמרור");
		}}); 
		values.put("TEURA", new HashMap<Integer, String>() {{
			put(1, "אור יום רגיל");
			put(2, "ראות מוגבלת עקב מזג אויר (עשן,ערפל)");
			put(3, "לילה פעלה תאורה");
			put(4, "קיימת תאורה בלתי תקינה/לא פועלת");
			put(5, "לילה לא קיימת תאורה");
		}}); 
		values.put("BAKARA", new HashMap<Integer, String>() {{
			put(1, "אין בקרה");
			put(2, "רמזור תקין");
			put(3, "רמזור מהבהב צהוב");
			put(4, "רמזור לא תקין");
			put(5, "תמרור עצור");
			put(6, "תמרור זכות קדימה");
			put(7, "אחר");
		}}); 
		values.put("MEZEG_AVIR", new HashMap<Integer, String>() {{
			put(1, "בהיר");
			put(2, "גשום");
			put(3, "שרבי");
			put(4, "ערפילי");
			put(5, "אחר");
		}}); 
		values.put("MEZEG_AVIR_UNITED", new HashMap<Integer, String>() {{
			put(1, "בהיר");
			put(2, "עננים מתפזרים");
			put(3, "היערמות עננים");
			put(4, "ראות לקויה כתוצאה מעשן");
			put(5, "אובך");
			put(6, "אבק");
			put(7, "סופת חול");
			put(8, "ראות לקויה");
			put(9, "ערפל קל");
			put(10, "ברקים");
			put(11, "סופת רעמים");
			put(12, "סערה");
			put(13, "סופה באופק");
			put(14, "טפטוף");
			put(15, "גשם");
			put(16, "שלג");
			put(17, "שלג מעורב בגשם");
			put(18, "קרה(גשם קפוא)");
			put(19, "גשם כבד");
			put(20, "שלג כבד");
			put(21, "ברד כבד");
			put(22, "ערפל");
			put(23, "סופת רעמים וגשם");
			put(24, "סופת חול קלה");
			put(25, "סחף שלג (ראות לקויה)");
			put(26, "ערפל באופק");
			put(27, "כיסי ערפל");
			put(28, "ערפל קל מתפוגג");
			put(29, "ערפל כבד מתפוגג");
			put(30, "ערפל כבד");
			put(31, "כפור, ערפל קל");
			put(32, "כפור, ערפל כבד");
			put(33, "טפטוף קל לפרקים");
			put(34, "טפטוף קל");
			put(35, "טפטוף");
			put(36, "גשם קל לפרקים");
			put(37, "גשם קל");
			put(38, "טפטוף קל, קופא במגע עם הקרקע");
			put(39, "טפטוף קופא במגע עם הקרקע");
			put(40, "גשם לפרקים");
			put(41, "גשם כבד לפרקים");
			put(42, "גשם קל קופא במגע עם הקרקע");
			put(43, "גשם קופא במגע עם הקרקע");
			put(44, "שלג קל מעורב בגשם");
			put(45, "שלג כבד מעורב בגשם");
			put(46, "שלג קל לפרקים");
			put(47, "שלג קל");
			put(48, "שלג לפרקים");
			put(49, "שלג");
			put(50, "שלג כבד לפרקים");
			put(51, "שלג כבד");
			put(52, "שלג, שמיים בהירים");
			put(53, "שלג דק");
			put(54, "שלג עבה");
			put(55, "שלג מעורב בגשם, קרח שחור");
			put(56, "ממטרים קלים");
			put(57, "ממטרים");
			put(58, "ממטרים כבדים");
			put(59, "ממטרים קלים, שלג מעורב בגשם");
			put(60, "ממטרים, שלג מעורב בגשם");
			put(61, "ממטרי שלג קלים");
			put(62, "ממטרי שלג");
			put(63, "ממטרי שלג/ברד קלים");
			put(64, "ממטרי ברד/שלג");
			put(65, "ממטרי ברד קלים");
			put(66, "ממטרי ברד");
			put(67, "סופת רעמים, גשם קל");
			put(68, "גשם, סופת רעמים");
			put(69, "סופת רעמים, שלג קל/שלג קל מעורב בגשם");
			put(70, "סופת רעמים, שלג/ שלג מעורב בגשם");
			put(71, "סופת רעמים");
			put(72, "סופת רעמים, ברד");
			put(73, "סופת רעמים כבדה");
			put(74, "סופת רעמים וחול כבדה");
			put(75, "סופת רעמים כבדה, ברד");
			put(76, "סופת רוחות");
			put(77, "רוחות חזקות");
			put(78, "גשם שוטף");
			put(79, "גשם זלעפות");
			put(80, "סופת רוחות, גשם קל");
			put(81, "גשם וסופת רוחות ");
			put(82, "סופת רוחות, גשם שוטף");
			put(83, "סופת רוחות, גשם זלעפות");
			put(84, "רוחות חזקות, גשם קל");
			put(85, "גשם ורוחות חזקות");
			put(86, "רוחות חזקות, גשם שוטף");
			put(87, "רוחות חזקות, גשם זלעפות");
		}}); 
		values.put("PNE_KVISH", new HashMap<Integer, String>() {{
			put(1, "יבש");
			put(2, "רטוב ממים");
			put(3, "מרוח בחומר דלק");
			put(4, "מכוסה בבוץ");
			put(5, "חול או חצץ על הכביש");
			put(6, "אחר");
		}}); 
		values.put("SUG_EZEM", new HashMap<Integer, String>() {{
			put(1, "עץ");
			put(2, "עמוד חשמל/תאורה/טלפון");
			put(3, "תמרור ושלט");
			put(4, "גשר סימניו ומגיניו");
			put(5, "מבנה");
			put(6, "גדר בטיחות לרכב");
			put(7, "חבית");
			put(8, "אחר");
		}}); 
		values.put("MERHAK_EZEM", new HashMap<Integer, String>() {{
			put(1, "עד מטר");
			put(2, "1-3 מטר");
			put(3, "על הכביש");
			put(4, "על שטח הפרדה");
		}}); 
		values.put("LO_HAZA", new HashMap<Integer, String>() {{
			put(1, "הלך בכיוון התנועה");
			put(2, "הלך נגד");
			put(3, "שיחק על הכביש");
			put(4, "עמד על הכביש");
			put(5, "היה על אי הפרדה");
			put(6, "היה על שוליים/מדרכה");
			put(7, "אחר");
		}}); 
		values.put("OFEN_HAZIYA", new HashMap<Integer, String>() {{
			put(1, "התפרץ אל הכביש");
			put(2, "חצה שהוא מוסתר");
			put(3, "חצה רגיל");
			put(4, "אחר");
		}}); 
		values.put("MEKOM_HAZIYA", new HashMap<Integer, String>() {{
			put(1, "לא במעבר חציה ליד צומת");
			put(2, "לא במעבר חציה לא ליד צומת");
			put(3, "במעבר חציה בלי רמזור");
			put(4, "במעבר חציה עם רמזור");
		}}); 
		values.put("KIVUN_HAZIYA", new HashMap<Integer, String>() {{
			put(1, "מימין לשמאל");
			put(2, "משמאל לימין");
		}}); 
		values.put("STATUS_IGUN", new HashMap<Integer, String>() {{
			put(1, "עיגון מדויק");
			put(2, "מרכז ישוב");
			put(3, "מרכז דרך");
			put(4, "מרכז קילומטר");
			put(9, "לא עוגן");
		}}); 
		values.put("SUG_MEORAV", new HashMap<Integer, String>() {{
			put(1, "נהג שלא נפגע");
			put(2, "נהג נפגע");
			put(3, "נפגע שאינו נהג");
		}}); 
		values.put("MIN", new HashMap<Integer, String>() {{
			put(1, "זכר");
			put(2, "נקבה");
		}}); 
		values.put("SUG_REHEV_NASA_LMS", new HashMap<Integer, String>() {{
			put(1, "רכב נוסעים פרטי");
			put(2, "משא עד 3.5 טון אחוד");
			put(3, "משא עד 3.5 טון לא אחוד");
			put(4, "משא 1.4 עד 9.9 טון משקל כולל");
			put(5, "משא 10 עד 15.9 טון משקל כולל");
			put(6, "משא 16 עד 33.9 טון משקל כולל");
			put(7, "משא 34.0+טון משקל כולל");
			put(8, "אופנוע עד 50 סמ״ק");
			put(9, "אופנוע 51 עד 250 סמ״ק");
			put(10, "אופנוע 251 עד 500 סמ״ק");
			put(11, "אוטובוס");
			put(12, "מונית");
			put(13, "רכב עבודה");
			put(14, "טרקטור");
			put(15, "אופניים");
			put(16, "רכבת");
			put(17, "אחר");
			put(18, "אוטובוס זעיר");
			put(19, "אופנוע 501+ סמ״ק");
		}}); 
		values.put("EMZAE_BETIHUT", new HashMap<Integer, String>() {{
			put(1, "חגר חגורה");
			put(2, "חבש קסדת מגן (רק לאופנוע)");
			put(3, "ישב במושב/ריתמה לילדים (רק לנפגע ילד)");
			put(4, "לא השתמש באמצעי");
			put(5, "לא ידוע");
		}}); 
		values.put("HUMRAT_PGIA", new HashMap<Integer, String>() {{
			put(1, "הרוג");
			put(2, "פצוע קשה");
			put(3, "פצוע קל");
		}}); 
		values.put("SUG_NIFGA_LMS", new HashMap<Integer, String>() {{
			put(1, "הולך רגל");
			put(2, "נהג-רכב בעל 4+ גלגלים");
			put(3, "נוסע- רכב בעל 4+ גלגלים");
			put(4, "נהג-אופנוע");
			put(5, "נוסע-אופנוע (לא נהג)");
			put(6, "נהג-אופניים");
			put(7, "נוסע-אופניים (לא נהג)");
			put(8, "נהג-רכב לא ידוע");
			put(9, "נוסע-רכב לא ידוע");
		}}); 
		values.put("PEULAT_NIFGA_LMS", new HashMap<Integer, String>() {{
			put(1, "ישב ברכב במושב קדמי");
			put(2, "ישב ברכב במושב אחורי");
			put(3, "ישב ברכב בארגז מאחור");
			put(4, "עמד ברכב");
			put(5, "עלה לרכב");
			put(6, "ירד מהרכב");
			put(7, "פעולה אחרת");
			put(8, "לא ידוע");
			put(9, "הולך רגל");
		}}); 
		values.put("PAZUA_USHPAZ", new HashMap<Integer, String>() {{
			put(1, "אשפוז עד 24 שעות");
			put(2, "אשפוז מעל 24 שעות");
		}}); 
		values.put("MADAD_RAFUI", new HashMap<Integer, String>() {{
			put(1, "קל (1-8)");
			put(2, "בינוני (9-15)");
			put(3, "קשה (16-24)");
			put(4, "קשה מאוד (25-75)");
		}}); 
		values.put("YAAD_SHIHRUR", new HashMap<Integer, String>() {{
			put(1, "בית");
			put(2, "בית חולים אחר");
			put(3, "מוסד שיקומי/ מחלקה שיקומית");
			put(4, "מוות");
			put(5, "אחר");
		}}); 
		values.put("SHIMUSH_BE_AVIZAREY_BETIHOT", new HashMap<Integer, String>() {{
			put(1, "כן");
			put(2, "לא");
			put(3, "לא ידוע");
		}}); 
		values.put("PTIRA_MEUHERET", new HashMap<Integer, String>() {{
			put(1, "פטירה רגילה עד 30 יום");
			put(2, "פטירה מאוחרת מעל 30 יום");
		}}); 
	localizedNames.put("SUG_DEREH", "סוג דרך");
	localizedNames.put("SHEM_ZOMET", "שם צומת");
	localizedNames.put("SEMEL_YISHUV", "ישוב");
	localizedNames.put("REHOV1", "רחוב 1");
	localizedNames.put("REHOV2", "רחוב 2");
	localizedNames.put("BAYIT", "מספר בית");
	localizedNames.put("ZOMET_IRONI", "צומת עירוני");
	localizedNames.put("KVISH1", "כביש 1");
	localizedNames.put("KVISH2", "כביש 2");
	localizedNames.put("ZOMET_LO_IRONI", "צומת לא עירוני");
	localizedNames.put("YEHIDA", "יחידה");
	localizedNames.put("SUG_YOM", "סוג יום");
	localizedNames.put("RAMZOR", "רמזור");
	localizedNames.put("HUMRAT_TEUNA", "חומרת תאונה");
	localizedNames.put("SUG_TEUNA", "סוג תאונה");
	localizedNames.put("ZURAT_DEREH", "צורת דרך");
	localizedNames.put("HAD_MASLUL", "חד מסלול");
	localizedNames.put("RAV_MASLUL", "רב מסלול");
	localizedNames.put("MEHIRUT_MUTERET", "מהירות מותרת");
	localizedNames.put("TKINUT", "תקינות");
	localizedNames.put("ROHAV", "רוחב");
	localizedNames.put("SIMUN_TIMRUR", "סימון תמרור");
	localizedNames.put("TEURA", "תאורה");
	localizedNames.put("BAKARA", "בקרה");
	localizedNames.put("MEZEG_AVIR", "מזג אוויר");
	localizedNames.put("MEZEG_AVIR_UNITED", "מזג אוויר");
	localizedNames.put("PNE_KVISH", "פני כביש");
	localizedNames.put("SUG_EZEM", "סוג עצם");
	localizedNames.put("MERHAK_EZEM", "מרחק עצם");
	localizedNames.put("LO_HAZA", "לא חצה");
	localizedNames.put("OFEN_HAZIYA", "אופן חציה");
	localizedNames.put("MEKOM_HAZIYA", "מקום חציה");
	localizedNames.put("KIVUN_HAZIYA", "כיוון חציה");
	localizedNames.put("STATUS_IGUN", "עיגון");
	localizedNames.put("MAHOZ", "מחוז");
	localizedNames.put("NAFA", "נפה");
	localizedNames.put("EZOR_TIVI", "אזור טבעי");
	localizedNames.put("MAAMAD_MINIZIPALI", "מעמד מוניציפלי");
	localizedNames.put("ZURAT_ISHUV", "צורת יישוב");
	localizedNames.put("SUG_MEORAV", "סוג מעורב");
	localizedNames.put("SHNAT_HOZAA", "שנת הוצאת רשיון נהיגה");
	localizedNames.put("KVUZA_GIL", "קבוצת גיל");
	localizedNames.put("MIN", "מין");
	localizedNames.put("SUG_REHEV_NASA_LMS", "סוג רכב בו נסע");
	localizedNames.put("EMZAE_BETIHUT", "אמצעי בטיחות");
	localizedNames.put("HUMRAT_PGIA", "חומרת פגיעה");
	localizedNames.put("SUG_NIFGA_LMS", "סוג נפגע");
	localizedNames.put("PEULAT_NIFGA_LMS", "מיקום פצוע");
	localizedNames.put("KVUTZAT_OHLUSIYA_LMS", "קבוצת אוכלוסיה");
	localizedNames.put("MAHOZ_MEGURIM", "מחוז מגורים");
	localizedNames.put("NAFA_MEGURIM", "נפת מגורים");
	localizedNames.put("EZOR_TIVI_MEGURIM", "אזור טבעי מגורים");
	localizedNames.put("MAAMAD_MINIZIPALI_MEGURIM", "מעמד מוניצפלי מגורים");
	localizedNames.put("ZURAT_ISHUV_MEGURIM", "צורת ישוב מגורים");
	localizedNames.put("PAZUA_USHPAZ", "משך אשפוז");
	localizedNames.put("MADAD_RAFUI", "מדד רפואי לחומרת הפציעה - ISS");
	localizedNames.put("YAAD_SHIHRUR", "יעד שחרור");
	localizedNames.put("SHIMUSH_BE_AVIZAREY_BETIHOT", "שימוש באביזרי בטיחות");
	localizedNames.put("PTIRA_MEUHERET", "מועד הפטירה");
	localizedNames.put("NEFAH", "נפח מנוע");
	localizedNames.put("SHNAT_YITZUR", "שנת ייצור");
	localizedNames.put("KIVUNE_NESIA", "כיוון נסיעה");
	localizedNames.put("MATZAV_REHEV", "מצב רכב");
	localizedNames.put("SHIYUH_REHEV_LMS", "שיוך רכב");
	localizedNames.put("SUG_REHEV_LMS", "סוג רכב");
	localizedNames.put("MEKOMOT_YESHIVA_LMS", "מקומות ישיבה");
	localizedNames.put("MISHKAL_KOLEL_LMS", "משקל כולל");
	localizedNames.put("ACC_ID", "מספר סידורי");
	localizedNames.put("PROVIDER_CODE", "סוג תיק");
	}
}