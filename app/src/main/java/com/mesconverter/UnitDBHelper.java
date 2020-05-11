package com.mesconverter;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by aditya on 25/9/17.
 */

public class UnitDBHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "UNITINFO.DB";
    private static final int DATABASE_VERSION = 1;
    private static final String QUERY =
            "CREATE TABLE " + Unit.UnitInfo.TABLE_NAME + "(" + Unit.UnitInfo.UNIT_FROM + " TEXT," + Unit.UnitInfo.UNIT_TO + " TEXT, " + Unit.UnitInfo.UNIT_VALUE + " TEXT);";


    public UnitDBHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        Log.e("DATABASE OPERATIONS", "Database Opened /Created ...");
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(QUERY);
        Log.e("DATABASE OPERATIONS", "Database Created ...");
    }

    public Cursor getdatabase(UnitDBHelper db) {
        SQLiteDatabase sq = db.getReadableDatabase();
        String[] columns = {Unit.UnitInfo.UNIT_FROM, Unit.UnitInfo.UNIT_TO, Unit.UnitInfo.UNIT_VALUE};
        Cursor c = sq.query(Unit.UnitInfo.TABLE_NAME, columns, null, null, null, null, null);
        return c;
    }

    public void writeDatabase(UnitDBHelper db) {
        SQLiteDatabase sq = db.getWritableDatabase();

//Area
//Sq Kilometre
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Sq Kilometre', 'Acre', '274.10');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Sq Kilometre', 'Hectare', '100');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Sq Kilometre', 'Sq Metre', '1000000');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Sq Kilometre', 'Sq Centimetre', '10000000000');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Sq Kilometre', 'Sq Mile', '0.386102');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Sq Kilometre', 'Sq Yard', '1195990.046301');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Sq Kilometre', 'Sq Inch', '1550003100.0062');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Sq Kilometre', 'Sq Foot', '10763910.41671');");
//Sq Metre
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Sq Metre', 'Acre', '0.000247105');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Sq Metre', 'Hectare', '0.0001');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Sq Metre', 'Sq Centimetre', '10000');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Sq Metre', 'Sq Foot', '10.76391');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Sq Metre', 'Sq Inch', '1550.0031');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Sq Metre', 'Sq Kilometre', '0.000001');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Sq Metre', 'Sq Mile', '0.000000386102');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Sq Metre', 'Sq Yard', '1.19599');");
//Sq Centimetre
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Sq Centimetre', 'Acre', '0.0000000247105');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Sq Centimetre', 'Hectare', '0.0000000247105');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Sq Centimetre', 'Sq Foot', '0.00107639');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Sq Centimetre', 'Sq Inch', '0.155');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Sq Centimetre', 'Sq Kilometre', '0.0000000001');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Sq Centimetre', 'Sq Metre', '0.0001');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Sq Centimetre', 'Sq Mile', '0.0000000000386102');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Sq Centimetre', 'Sq Yard', '0.000119599');");
//Acre
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Acre', 'Hectare', '0.404686');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Acre', 'Sq Centimetre', '40468564.224');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Acre', 'Sq Foot', '43560');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Acre', 'Sq Inch', '6272640');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Acre', 'Sq Kilometre', '0.00404686');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Acre', 'Sq Metre', '4046.856422');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Acre', 'Sq Mile', '0.0015625');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Acre', 'Sq Yard', '4840');");
//Hectare
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Hectare', 'Acre', '2.471054');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Hectare', 'Sq Centimetre', '100000000');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Hectare', 'Sq Foot', '107639.104167');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Hectare', 'Sq Inch', '15500031.000062');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Hectare', 'Sq Kilometre', '0.01');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Hectare', 'Sq metre', '10000');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Hectare', 'Sq Mile', '0.00386102');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Hectare', 'Sq Yards', '11959.900463');");
//Sq Foot
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Sq Foot', 'Acre', '0.0000229568');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Sq Foot', 'Hectare', '0.0000092903');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Sq Foot', 'Sq Centimetre', '929.0304');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Sq Foot', 'Sq Inch', '144');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Sq Foot', 'Sq Kilometre', '0.000000092903');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Sq Foot', 'Sq Metre', '0.092903');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Sq Foot', 'Sq Mile', '0.0000000358701');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Sq Foot', 'Sq Yard', '0.111111');");
//Sq Inch
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Sq Inch', 'Acre', '0.000000159423');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Sq Inch', 'Hectare', '0.000000064516');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Sq Inch', 'Sq Centimetre', '6.4516');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Sq Inch', 'Sq Foot', '0.00694444');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Sq Inch', 'Sq Kilometre', '0.00000000064516');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Sq Inch', 'Sq Metre', '0.00064516');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Sq Inch', 'Sq Mile', '0.000000000249098');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Sq Inch', 'Sq Yard', '0.000771605');");
//Sq Mile
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Sq Mile', 'Acre', '640');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Sq Mile', 'Hectare', '258.998811');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Sq Mile', 'Sq Centimetre', '25899881103.36');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Sq Mile', 'Sq Foot', '27878400');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Sq Mile', 'Sq Inch', '4014489600');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Sq Mile', 'Sq Kilometre', '2.589988');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Sq Mile', 'Sq Metre', '2589988.110336');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Sq Mile', 'Sq Yard', '3097600');");
//Energy
        //Joule
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Joule', 'BTU', '0.000947817');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Joule', 'Calorie', '0.239006');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Joule', 'Kilojoule', '0.001');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Joule', 'Kilowatt-Hour', '0.000000277778');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Joule', 'Kilocalorie', '0.000239006');");
//Kilojoule
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Kilojoule', 'BTU', '0.947817');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Kilojoule', 'Calorie', '239.005736');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Kilojoule', 'Kilocalorie', '0.239006');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Kilojoule', 'Joule', '1000');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Kilojoule', 'Killowatt-Hour', '0.000277778');");
//Kilowatt-Hour
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Kilowatt-Hour', 'BTU', '3412.141156');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Kilowatt-Hour', 'Calorie', '860420.650096');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Kilowatt-Hour', 'Kilocalorie', '860.42065');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Kilowatt-Hour', 'Joule', '3600000');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Kilowatt-Hour', 'Kilojoule', '3600');");
//BTU
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('BTU', 'Calorie', '252.164436');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('BTU', 'Kilocalorie', '0.252164');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('BTU', 'Joule', '1055.056');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('BTU', 'Kilojoule', '1.0555056');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('BTU', 'Kilowatt-Hour', '0.000293071');");
//Calorie
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Calorie', 'BTU', '0.00396567');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Calorie', 'Kilocalorie', '0.001');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Calorie', 'Joule', '4.184');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Calorie', 'Kilojoule', '0.004184');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Calorie', 'Kilowatt-Hour', '0.00000116222');");
//Power
//Watt
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Watt', 'Kilowatt', '0.001');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Watt', 'Megawatt', '0.000001');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Watt', 'HP (mechanical)', '0.001341022');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Watt', 'HP (metric)', '0.001359622');");
//Kilowatt
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Kilowatt', 'HP (mechanical)', '1.341022');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Kilowatt', 'HP (metric)', '1.359622');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Kilowatt', 'Megawatt', '0.001');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Kilowatt', 'Watt', '1000');");
//Megawatt
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Megawatt', 'HP (mechanical)', '1341.02209');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Megawatt', 'HP (metric)', '1359.621617');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Megawatt', 'Kilowatt', '1000');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Megawatt', 'Watt', '1000000');");

//HP (mechanical)
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('HP (mechanical)','HP (metrics)', '1.01387');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('HP (mechanical)','Kilowatt', '0.7457');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('HP (mechanical)','Megawatt', '0.0007457');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('HP (mechanical)','Watt', '745.699872');");

//HP (metric)
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('HP (metrics)','HP (mechanical)', '0.98632');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('HP (metrics)','Kilowatt', '0.735499');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('HP (metrics)','Megawatt', '0.000735499');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('HP (metrics)','Watt', '735.49875');");

//Speed
//Foot/second
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Foot/second','Kilometre/hour', '1.09728');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Foot/second', 'Knot', '0.592484');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Foot/second', 'Metre/second', '0.3048');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Foot/second', 'Mile/hour', '0.681818');");
//Kilometre/hour
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Kilometre/hour', 'Foot/second', '0.911344');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Kilometre/hour', 'Knot', '0.539957');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Kilometre/hour', 'Metre/second', '0.277778');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Kilometre/hour', 'Mile/hour', '0.621371');");
//Knot
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Knot', 'Foot/second', '1.68781');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Knot', 'Kilometre/hour', '1.852');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Knot', 'Metre/second', '0.514444');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Knot', 'Mile/hour', '1.150779');");
//Metre/second
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Metre/second', 'Foot/second', '3.28084');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Metre/second', 'Kilometre/hour', '3.6');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Metre/second', 'Knot', '1.943844');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Metre/second', 'Mile/hour', '2.236936');");
//Mile/hour
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Mile/hour', 'Foot/second', '1.466667');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Mile/hour', 'Kilometre/hour', '1.609344');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Mile/hour', 'Knot', '0.868976');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Mile/hour', 'Metre/second', '0.44704');");
//Length
        //Centimetre (cm)
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Centimetre (cm)', 'Metre', '0.01');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Centimetre (cm)', 'Micrometre', '10000');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Centimetre (cm)', 'Miles', '0.00000621371');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Centimetre (cm)', 'Millimetre (mm)', '10');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Centimetre (cm)', 'Nanometre', '10000000');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Centimetre (cm)', 'Yard', '0.0109361');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Centimetre (cm)', 'Nautical Mile', '0.00000539957');");

//Metre

        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Metre', 'Micrometre', '1000000');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Metre', 'Millimetre (mm)', '1000');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Metre', 'Nanometre', '1000000000');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Metre', 'Yard ', '1.093613');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Metre', 'Centimetre (cm)', '100');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Metre', 'Mile ', '0.000621371192');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Metre', 'Nautical Mile ', '0.000539957');");

//Micrometre (mm)
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Micrometre', 'Metre', '0.000001');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Micrometre', 'Mile', '0.000000000621371');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Micrometre', 'Millimetre (mm)', '0.001');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Micrometre', 'Nanometre', '1000');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Micrometre', 'Yard', '0.00000109361');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Micrometre', 'Centimetre (cm)', '0.0001');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Micrometre', 'Nautical Mile', '0.000000000539957');");

//Mile
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Mile', 'Metre', '1609.344');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Mile', 'Micrometre', '1609344000');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Mile', 'Millimetre (mm)', '1609344');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Mile', 'Nanometre', '1609344000000');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Mile', 'Yard', '1760');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Mile', 'Centimetre (cm)', '160934.4');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Mile', 'Nautical Mile', '0.868976');");

//Millimetre
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Millimetre (mm)', 'Metre', '0.001');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Millimetre (mm)', 'Micrometre', '1000');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Millimetre (mm)', 'Mile', '0.000000621371');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Millimetre (mm)', 'Nanometre', '1000000');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Millimetre (mm)', 'Nautical Mile', '0.000000539957');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Millimetre (mm)', 'Yard', '0.00109361');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Millimetre (mm)', 'Nautical Mile', '0.000000539957');");

//Nanometre
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Nanometre', 'Metre', '0.000000001');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Nanometre', 'Micrometre', '0.001');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Nanometre', 'Mile', '0.000000000000621371');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Nanometre', 'Millimeter (mm)', '0.000001');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Nanometre', 'Nautical Mile', '0.000000000000539957');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Nanometre', 'Yard', '0.00000000109361');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Nanometre', 'Nautical Mile', '0.000000000000539957');");

//Nautical Mile
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Nautical Mile', 'Metre', '1852');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Nautical Mile', 'Micrometre', '1852000000');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Nautical Mile', 'Mile', '1.150779');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Nautical Mile', 'Millimetre (mm)', '1852000');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Nautical Mile', 'Nanometre', '1852000000000');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Nautical Mile', 'Yard', '2025.371829');");

//Yard
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Yard', 'Metre', '0.9144');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Yard', 'Micrometre', '914400');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Yard', 'Mile', '0.000568182');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Yard', 'Millimetre', '914.4');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Yard', 'Nanometre', '914400000');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Yard', 'Nautical Mile', '0.000493737');");

//Volume
        //Cubic cm
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Cubic cm', 'Cubic Foot', '0.0000353147');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Cubic cm', 'Cubic Inch', '0.0610237');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Cubic cm', 'Cubic Metre', '0.000001');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Cubic cm', 'Cup', '0.00422675');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Cubic cm', 'Gallon (US)', '0.000264172');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Cubic cm', 'Gallon (UK)', '0.000219969');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Cubic cm', 'Litre', '0.001');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Cubic cm', 'Millilitre', '1');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Cubic cm', 'Tablespoon', '0.067628');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Cubic cm', 'Teaspoon', '0.202884');");
//Cubic Foot
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Cubic Foot', 'Cubic cm', '28316.846592');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Cubic Foot', 'Cubic Inch', '1728');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Cubic Foot', 'Cubic Metre', '0.0283168');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Cubic Foot', 'Cup', '119.688312');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Cubic Foot', 'Gallon (US)', '7.480519');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Cubic Foot', 'Gallon (UK)', '6.228835');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Cubic Foot', 'Litre', '28.316847');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Cubic Foot', 'Millilitre', '28316.846592');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Cubic Foot', 'Tablespoon', '1915.012987');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Cubic Foot', 'Teaspoon', '5745.038961');");

//Cubic Inch
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Cubic Inch', 'Cubic cm', '16.387064');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Cubic Inch', 'Cubic Foot', '0.000578704');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Cubic Inch', 'Cubic Metre', '0.0000163871');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Cubic Inch', 'Cup', '0.0692641');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Cubic Inch', 'Gallon (US)', '0.004329');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Cubic Inch', 'Gallon (UK)', '0.00360465');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Cubic Inch', 'Litre', '0.0163871');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Cubic Inch', 'Millilitre', '16.387064');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Cubic Inch', 'Tablespoon', '1.108225');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Cubic Inch', 'Teaspoon', '3.324675');");

//Cubic Metre

        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Cubic Metre', 'Cubic cm', '100000');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Cubic Metre', 'Cubic Foot', '35.314667');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Cubic Metre', 'Cubic Inch', '61023.744095');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Cubic Metre', 'Cup', '4226.752838');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Cubic Metre', 'Gallon (US)', '264.172052');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Cubic Metre', 'Gallon (UK)', '219.969248');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Cubic Metre', 'Litre', '1000');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Cubic Metre', 'Millilitre', '1000000');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Cubic Metre', 'Tablespoon', '67628.045404');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Cubic Metre', 'Teaspoon', '202884.136211');");

//Cup
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Cup', 'Cubic cm', '236.588237');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Cup', 'Cubic Foot', '0.00835503');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Cup', 'Cubic Inch', '14.4375');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Cup', 'Cubic Metre', '0.000236588');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Cup', 'Gallon (US)', '0.0625');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Cup', 'Gallon (UK)', '0.0520421');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Cup', 'Litre', '0.236588');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Cup', 'Millilitre', '236.588237');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Cup', 'Tablespoon', '16');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Cup', 'Teaspoon', '48');");

//Gallon (US)
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Gallon (US)', 'Cubic cm', '3785.411784');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Gallon (US)', 'Cubic Foot', '0.133681');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Gallon (US)', 'Cubic Inch', '231');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Gallon (US)', 'Cubic Metre', '0.00378541');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Gallon (US)', 'Cup', '16');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Gallon (US)', 'Gallon (UK)', '0.832674');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Gallon (US)', 'Litre', '3.785412');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Gallon (US)', 'Millilitre', '3785.411784');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Gallon (US)', 'Tablespoon', '256');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Gallon (US)', 'Teaspoon', '768');");

//Gallon (UK)
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Gallon (UK)', 'Cubic cm', '4546.09');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Gallon (UK)', 'Cubic Foot', '0.160544');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Gallon (UK)', 'Cubic Inch', '277.419433');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Gallon (UK)', 'Cubic Metre', '0.00454609');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Gallon (UK)', 'Cup', '19.215199');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Gallon (UK)', 'Gallon (US)', '1.20095');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Gallon (UK)', 'Litre', '4.54609');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Gallon (UK)', 'Millilitre', '4546.09');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Gallon (UK)', 'Tablespoon', '307.443181');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Gallon (UK)', 'Teaspoon', '922.329543');");

//Litre
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Litre', 'Cubic cm', '1000');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Litre', 'Cubic Foot', '0.0353147');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Litre', 'Cubic Inch', '61.023744');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Litre', 'Cubic Metre', '0.001');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Litre', 'Cup', '4.226753');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Litre', 'Gallon (US)', '0.264172');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Litre', 'Gallon (UK)', '0.219969');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Litre', 'Millilitre', '1000');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Litre', 'Tablespoon', '67.628045');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Litre', 'Teaspoon', '202.884136');");

//Millilitre
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Millilitre', 'Cubic cm', '1');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Millilitre', 'Cubic Foot', '0.000353147');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Millilitre', 'Cubic Inch', '0.0610237');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Millilitre', 'Cubic Metre', '0.000001');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Millilitre', 'Cup', '0.00422675');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Millilitre', 'Gallon (US)', '0.000264172');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Millilitre', 'Gallon (UK)', '0.000219969');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Millilitre', 'Litre', '0.001');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Millilitre', 'Tablespoon', '0.067628');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Millilitre', 'Teaspoon', '0.202884');");

//Tablespoon
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Tablespoon', 'Cubic cm', '14.786765');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Tablespoon', 'Cubic Foot', '0.00052219');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Tablespoon', 'Cubic Inch', '0.902344');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Tablespoon', 'Cubic Metre', '0.0000147868');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Tablespoon', 'Cup', '0.0625');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Tablespoon', 'Gallon (US)', '0.00390625');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Tablespoon', 'Gallon (UK)', '0.00325263');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Tablespoon', 'Litre', '0.0147868');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Tablespoon', 'Millilitre', '14.786765');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Tablespoon', 'Teaspoon', '3');");

//Teaspoon
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Teaspoon', 'Cubic cm', '4.928922');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Teaspoon', 'Cubic Foot', '0.000174063');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Teaspoon', 'Cubic Inch', '0.300781');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Teaspoon', 'Cubic Metre', '0.00000492892');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Teaspoon', 'Cup', '0.0208333');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Teaspoon', 'Gallon (US)', '0.00130208');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Teaspoon', 'Gallon (UK)', '0.00108421');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Teaspoon', 'Litre', '0.00492892');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Teaspoon', 'Millilitre', '4.928922');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Teaspoon', 'Tablespoon', '0.333333');");

//Mass
        //Grain
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Grain', 'Gram', '0.0647989');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Grain', 'Kilogram', '0.0000647989');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Grain', 'Milligram', '64.79891');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Grain', 'Pound', '0.000142857');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Grain', 'Ton (US/short)', '0.0000000714286');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Grain', 'Ton (UK/long)', '0.0000000637755');");

//Gram
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Gram', 'Grain', '15.432358');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Gram', 'Kilogram', '0.001');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Gram', 'Milligram', '1000');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Gram', 'Pound', '0.00220462');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Gram', 'Ton (UK/long)', '0.000000984207');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Gram', 'Ton (US/short)','0.00000110231');");

//Kilogram
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Kiligram', 'Grain', '15432.358353');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Kiligram', 'Gram', '1000');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Kiligram', 'Milligram', '1000000');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Kiligram', 'Pound', '2.204623');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Kiligram', 'Ton (UK/long)', '0.000984207');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Kiligram', 'Ton (UK/short)', '0.00110231');");

//Milligram
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Milligram', 'Grain', '0.0154324');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Milligram', 'Gram', '0.001');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Milligram', 'Kilogram', '0.000001');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Milligram', 'Pound', '0.00000220462');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Milligram', 'Ton (UK/long)', '0.000000000984207');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Milligram', 'Ton (UK/short)', '0.00000000110231');");

//Pound
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Pound', 'Grain', '7000');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Pound', 'Gram', '453.59237');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Pound', 'Kilogram', '0.453592');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Pound', 'Milligram', '453592.37');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Pound', 'Ton (UK/long)', '0.000446429');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Pound', 'Ton (UK/short)', '0.0005');");

//Ton (UK/long)
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Ton (UK/long)', 'Grain', '15680000');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Ton (UK/long)', 'Gram', '1016046.9088');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Ton (UK/long)', 'Kilogram', '1016.046909');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Ton (UK/long)', 'Milligram', '1016046908.8');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Ton (UK/long)', 'Pound', '2240');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Ton (UK/long)', 'Ton (US/short', '1.12');");

//Ton (US/short)
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Ton (US/short)', 'Grain', '14000000');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Ton (US/short)', 'Gram', '907184.74');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Ton (US/short)', 'Kilogram', '907.18474');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Ton (US/short)', 'Milligram', '907184740');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Ton (US/short)', 'Pound', '2000');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Ton (US/short)', 'Ton (UK/long)', '0.892857');");

//bit
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Bit', 'Byte', '0.125');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Bit', 'Kilobit', '0.001');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Bit', 'Kilobyte', '0.000125');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Bit', 'Megabit', '0.000001');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Bit', 'Megabyte', '0.000000125');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Bit', 'Gigabit', '0.000000001');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Bit', 'Gigabyte', '0.000000000125');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Bit', 'Terabit', '0.000000000001');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Bit', 'Terabyte', '0.000000000125');");

//byte
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Byte', 'Bit', '8');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Byte', 'Kilobit', '0.008');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Byte', 'Kilobyte', '0.001');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Byte', 'Megabit', '0.000008');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Byte', 'Megabyte', '0.000001');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Byte', 'Gigabit', '0.000000008');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Byte', 'Gigabyte', '0.0000000001');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Byte', 'Terabit', '0.000000000008');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Byte', 'Terabyte', '0.000000000001');");
//kilobit
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Kilobit', 'Byte', '125');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Kilobit', 'Bit', '1000');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Kilobit', 'Kilobyte', '0.125');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Kilobit', 'Megabit', '0.001');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Kilobit', 'Megabyte', '0.000125');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Kilobit', 'Gigabit', '0.000001');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Kilobit', 'Gigabyte', '0.000000125');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Kilobit', 'Terabit', '0.000000001');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Kilobit', 'Terabyte', '0.000000000125');");
//kilobyte
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Kilobyte', 'Byte', '1000');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Kilobyte', 'Kilobit', '8');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Kilobyte', 'Bit', '8000');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Kilobyte', 'Megabit', '0.008');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Kilobyte', 'Megabyte', '0.001');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Kilobyte', 'Gigabit', '0.000008');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Kilobyte', 'Gigabyte', '0.000001');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Kilobyte', 'Terabit', '0.000000008');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Kilobyte', 'Terabyte', '0.000000001');");
//megabit
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Megabit', 'Byte', '125000');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Megabit', 'Kilobit', '1000');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Megabit', 'Kilobyte', '125');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Megabit', 'Bit', '1000000');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Megabit', 'Megabyte', '0.125');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Megabit', 'Gigabit', '0.001');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Megabit', 'Gigabyte', '0.000125');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Megabit', 'Terabit', '0.0000001');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Megabit', 'Terabyte', '0.000000125');");

        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Megabyte', 'Byte', '1000000');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Megabyte', 'Kilobit', '8000');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Megabyte', 'Kilobyte', '1000');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Megabyte', 'Megabit', '8');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Megabyte', 'Bit', '8000000');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Megabyte', 'Gigabit', '0.008');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Megabyte', 'Gigabyte', '0.001');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Megabyte', 'Terabit', '0.000008');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Megabyte', 'Terabyte', '0.000001');");

        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Gigabit', 'Byte', '12500000000');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Gigabit', 'Kilobit', '1000000');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Gigabit', 'Kilobyte', '12500000');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Gigabit', 'Megabit', '1000');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Gigabit', 'Megabyte', '12500');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Gigabit', 'Bit', '1000000000');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Gigabit', 'Gigabyte', '0.125');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Gigabit', 'Terabit', '0.001');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Gigabit', 'Terabyte', '0.000125');");

        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Gigabyte', 'Byte', '1000000000');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Gigabyte', 'Kilobit', '8000000');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Gigabyte', 'Kilobyte', '1000000');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Gigabyte', 'Megabit', '8000');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Gigabyte', 'Megabyte', '1000');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Gigabyte', 'Gigabit', '8000000');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Gigabyte', 'Bit', '8000000000');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Gigabyte', 'Terabit', '0.008');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Gigabyte', 'Terabyte', '0.001');");

        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Terabit', 'Byte', '125000000000000');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Terabit', 'Kilobit', '1000000000');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Terabit', 'Kilobyte', '125000000000');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Terabit', 'Megabit', '1000000');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Terabit', 'Megabyte', '125000000');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Terabit', 'Gigabit', '1000');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Terabit', 'Gigabyte', '125');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Terabit', 'Bit', '1000000000000');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Terabit', 'Terabyte', '0.125');");

        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Terabyte', 'Byte', '1000000000000');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Terabyte', 'Kilobit', '8000000000');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Terabyte', 'Kilobyte', '1000000000');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Terabyte', 'Megabit', '8000000');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Terabyte', 'Megabyte', '1000000');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Terabyte', 'Gigabit', '8000');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Terabyte', 'Gigabyte', '1000');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Terabyte', 'Terabit', '8');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Terabyte', 'Bit', '8000000000000');");

//end of digital storage conversion

// sq yard
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Sq Yard', 'Acre', '0.000206612');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Sq Yard', 'Hectare', '0.000083613');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Sq Yard', 'Sq Metre', '0.8361300021625');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Sq Yard', 'Sq Centimetre', '8361.27');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Sq Yard', 'Sq Mile', '0.0000003228304');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Sq Yard', 'Sq Kilometre', '0.000000837');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Sq Yard', 'Sq Inch', '1296');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Sq Yard', 'Sq Foot', '9');");


//km
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Kilometre', 'Centimetre (cm)', '100000');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Kilometre', 'Metre', '1000');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Kilometre', 'Feet', '3280.841666667');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Kilometre', 'Inch', '39370.1');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Kilometre', 'Micrometre', '1000000000');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Kilometre', 'Miles', '0.621371');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Kilometre', 'Millimetre (mm)', '1000000');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Kilometre', 'Nanometre', '1000000000000');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Kilometre', 'Yard', '1093.61');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Kilometre', 'Nautical Mile', '0.539957');");

//feet
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Feet', 'Centimetre (cm)', '30.48');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Feet', 'Metre', '0.3048');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Feet', 'Kilometre', '0.0003048');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Feet', 'Inch', '12');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Feet', 'Micrometre', '304800');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Feet', 'Miles', '0.000189394');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Feet', 'Millimetre (mm)', '304.8');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Feet', 'Nanometre', '3048000000');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Feet', 'Yard', '0.333333');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Feet', 'Nautical Mile', '0.000164579');");

//inch
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Inch', 'Centimetre (cm)', '2.54');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Inch', 'Metre', '0.0254');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Inch', 'Feet', '0.0833333');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Inch', 'Kilometre', '0.0000254');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Inch', 'Micrometre', '25400');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Inch', 'Miles', '0.0000157');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Inch', 'Millimetre (mm)', '25.4');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Inch', 'Nanometre', '254000000');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Inch', 'Yard', '0.02777808');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Inch', 'Nautical Mile', '0.00001371');");

//extras
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Centimetre (cm)', 'Kilometre', '0.00001');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Centimetre (cm)', 'Feet', '0.0328084');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Centimetre (cm)', 'Inch', '0.393701');");

        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Metre', 'Kilometre', '0.001');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Metre', 'Feet', '3.28084');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Metre', 'Inch', '39.3701');");

        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Micrometre', 'Kilometre', '0.000000001');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Micrometre', 'Feet', '0.000003280');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Micrometre', 'Inch', '0.0000393');");

        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Miles', 'Kilometre', '1.60934');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Miles', 'Feet', '5280');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Miles', 'Inch', '63360');");

        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Millimetre', 'Kilometre', '0.000001');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Millimetre', 'Feet', '0.00328084');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Millimetre', 'Inch', '0.0393701');");

        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Nanometre', 'Kilometre', '0.000000000001');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Nanometre', 'Feet', '0.000000003280');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Nanometre', 'Inch', '0.0000000393');");

        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Yard', 'Kilometre', '0.0009144');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Yard', 'Feet', '3');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Yard', 'Inch', '36');");

        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Nautical Mile', 'Kilometre', '1.852');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Nautical Mile', 'Feet', '6076.12');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Nautical Mile', 'Inch', '72913.4');");

//kilocalorie

        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Kilocalorie', 'BTU', '3.96567');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Kilocalorie', 'Joule', '4184');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Kilocalorie', 'Calorie', '1000');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Kilocalorie', 'Kilojoule', '4.184');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Kilocalorie', 'Kilowatt-Hour', '0.00116222');");

//yard cube
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Cubic Yard', 'Cubic cm', '764555');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Cubic Yard', 'Cubic Foot', '27');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Cubic Yard', 'Cubic Metre', '0.764555');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Cubic Yard', 'Cup', '3231.58');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Cubic Yard', 'Gallon (US)', '201.97');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Cubic Yard', 'Gallon (UK)', '168.179');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Cubic Yard', 'Litre', '764.555');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Cubic Yard', 'Millilitre', '764555');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Cubic Yard', 'Tablespoon', '43053.7');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Cubic Yard', 'Teaspoon', '129161');");

        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Cubic cm', 'Cubic Yard', '0.00000130');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Cubic Foot', 'Cubic Yard', '0.037037');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Cubic Metre', 'Cubic Yard', '1.30795');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Cup', 'Cubic Yard', '0.000313908');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Gallon (US)', 'Cubic Yard', '0.00495113');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Gallon (UK)', 'Cubic Yard', '0.00594606');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Litre', 'Cubic Yard', '0.00130795');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Millilitre', 'Cubic Yard', '0.00000130');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Tablespoon', 'Cubic Yard', '0.0000232');");
        sq.execSQL("insert into "+Unit.UnitInfo.TABLE_NAME+" values('Teaspoon', 'Cubic Yard', '0.00000774');");


        sq.close();
    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS " + DATABASE_NAME);
        onCreate(db);
    }
}
