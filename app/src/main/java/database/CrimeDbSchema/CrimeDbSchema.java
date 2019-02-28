package database.CrimeDbSchema;

public class CrimeDbSchema {
    public static final class CrimeTable {//定义CrimeTable内部类
        public static final String NAME = "crimes";

        public static final class Cols {//定义数据表字段
            public static final String UUID = "uuid";
            public static final String TITLE = "title";
            public static final String DATE = "date";
            public static final String SOLVED = "solved";
        }
    }
}
