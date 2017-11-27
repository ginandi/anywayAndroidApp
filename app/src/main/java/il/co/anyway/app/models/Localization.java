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
			put(4, "לא עירוני לא בצומת");
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
			put(61, "מחוז ירושלים");
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
	}
}