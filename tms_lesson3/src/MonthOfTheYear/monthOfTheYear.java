package MonthOfTheYear;

class monthOfTheYear {

    private static String[] arrOfMonth = {"January","February","March","April","May","June","July",
            "August","September","October","November","December"};

    public static String getMonth (int numOfMonth) {

        return arrOfMonth[numOfMonth - 1];
    }


}