public class minggu {
    public static void main(String args[]) {
        int year = 1901;
        boolean isLeapYear = false;
        int totalSundays = 0;
        int currentDay = 2;
        while(year <= 2000){
            isLeapYear = false;
            if((year%4) == 0){
                if((year % 100) == 0 && (year % 400) == 0){
                    isLeapYear = true;
                } else if((year % 100) == 0 && (year % 400) != 0){
                    isLeapYear = false;
                } else {
                    isLeapYear = true;
                }
            }
            for(int month = 1;month <= 12;month++){
                if(currentDay == 7){
                    totalSundays++;
                }
                if(month ==1 || month ==3 || month ==5 || month ==7 || month ==8 || month ==10 || month ==12){
                //Bulan January,March,May,July,August,October,December
                    currentDay+=3;
                } else if(month == 4 || month == 6 || month == 9 || month == 11){ 
                //Bulan April,June,September,November
                    currentDay+=2;              
                } else if(month == 2 && isLeapYear){
                //Bulan February has 29 days in a Leap Year
                    currentDay+=1;
                } 
                if(currentDay > 7){
                    currentDay=currentDay-7;
                }
            }
            year++;
        }
        System.out.print("Jumlah Hari Minggu : "+totalSundays);
    }
}