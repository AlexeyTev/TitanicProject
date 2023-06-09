public class Constants {
    public static final String CSV_FILE_COLUMN_HEADLINES = "PassengerId,Survived,Pclass,Name,Sex,Age,SibSp,Parch,Ticket,Fare,Cabin,Embarked";
    public static final String PATH_TO_CSV_FILE_NUMBER = "src/data/csvFileCounter.txt";
    public static final String PATH_TO_DATA_FILE = "src/data/titanic.csv";
    public static final int WINDOW_WIDTH = 600;
    public static final int WINDOW_HEIGHT = 700;
    public static final String[] PASSENGER_CLASS_OPTIONS = { "All", "1", "2", "3"};
    public static final int MARGIN_FROM_TOP = 10;
    public static final int MARGIN_FROM_LEFT = 5;
    public static final int LABEL_WIDTH = 100;
    public static final int LABEL_HEIGHT = 30;
    public static final int COMBO_BOX_WIDTH = 80;
    public static final int COMBO_BOX_HEIGHT = 30;
    public static final int BUTTON_WIDTH = 100;
    public static final int BUTTON_HEIGHT = 30;

    public static final int BUTTON_X = 250;
    public static final int BUTTON_Y= 500;

    public static final int PASSENGER_ID = 0;
    public static final int SURVIVED = 1;
    public static final int P_CLASS = 2;
    public static final int FIRST_NAME = 4;
    public static final int LAST_NAME = 3;
    public static final int SEX = 5;
    public static final int AGE = 6;
    public static final int SIB_SP = 7;
    public static final int PARCH = 8;
    public static final int TICKET = 9;
    public static final int FARE = 10;
    public static final int CABIN = 11;
    public static final int EMBARKED = 12;
    public static final int NULL_AGE = -1;
    public static final char NULL_EMBARKED = 'N';
    public static final int TEXT_FIELD_WIDTH = 40;

    public static final int PASSENGER_NAME_FIELD_WIDTH = 160;

    public static final String[] PASSENGER_SEX_OPTIONS = { "All", "Female", "Male"};


    public static final int PASSENGER_TICKET_FIELD_WIDTH = 100;

    public static final int LABEL_PADDING_RIGHT = 5;

    public static final String[] PASSENGER_EMBARKED_OPTIONS = { "All", "S", "Q","C"};

public static final int MAX_FILTERS = 12;

    public static final int PCLASS_FILTER = 0;
    public static final int MIN_ID_FILTER = 1;
    public static final int MAX_ID_FILTER = 2;
    public static final int NAME_FILTER = 3;
    public static final int SEX_FILTER = 4;
    public static final int SIBSP_FILTER = 5;
    public static final int PARCH_FILTER = 6;
    public static final int MIN_TICKET_COST_FILTER = 7;
    public static final int MAX_TICKET_COST_FILTER = 8;
    public static final int TICKET_NUM_FILTER = 9;
    public static final int CABIN_FILTER = 10;
    public static final int EMBARKED_FILTER = 11;
    public static final int ALL_OPTION = 0;
    public static final String CSV_FINISHER = ".csv";
    public static final String TXT_FINISHER = ".txt";
    public static final boolean MAX_ID_VALUE = true;
    public static final boolean MAX_TICKET_COST_VALUE = true;
    public static final String FILTER_PATH_NEW_FILE = "src/data/";
    public static final String FILTER_OUTPUT_BASE = "Total Rows:";
    public static final int TOTAL_P_CLASSES= 3;
    public static final int TOTAL_SEX= 2;

    public static final String STATS_NAME = "stats";
}
