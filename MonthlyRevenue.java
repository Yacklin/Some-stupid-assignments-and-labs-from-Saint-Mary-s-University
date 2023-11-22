/**
 * javabean class of monthly revenue
 *
 * @author Yilin Huang (A00475433)
 */

public class MonthlyRevenue {
    private String monthName;
    private double[] dailyRevenues;
    public static final int DEF_NUM_DAYS = 31;
    //Create a constructor for the class that takes in the month name and an array of daily revenues
public MonthlyRevenue(String monthName, double[] dailyRevenues){
        //Set the monthName to the parameter
        this.monthName=monthName;
        //Create an array of length 0
        this.dailyRevenues=new double[DEF_NUM_DAYS];
        //If the length of the daily Revenues is less than the default number of days
        if(dailyRevenues.length<DEF_NUM_DAYS){
            //Loop through the daily Revenues
            for (int i = 0; i < dailyRevenues.length; i++) {
                //Set the element at the current index of the array to the element at the same index of the daily Revenues
                this.dailyRevenues[i]=dailyRevenues[i];
            }
            //Loop through the remaining elements of the array
            for (int i = dailyRevenues.length; i <DEF_NUM_DAYS ; i++) {
                //Set the element at the current index of the array to NaN
                this.dailyRevenues[i]=Double.NaN;
            }
        }
    }
    //Constructor for the class that takes in the month name and an array of daily revenues
//Create a constructor for the class that takes in the month name
    public MonthlyRevenue(String monthName){
        //Create an array of length 0
        this(monthName,new double[0]);
    }
    /**
     * @return monthName
     */
    public String getMonthName() {
        return monthName;
    }
    /**
     * @param monthName
     */
    public void setMonthName(String monthName) {
        this.monthName = monthName;
    }
    /**
     *
     * @return dailyRevenues
     */
    //This method returns the revenue for a given day number
public double getRevenue(int dayNum) {
        //Check if the given day number is within the range of the default number of days
        if(0 < dayNum && dayNum <= DEF_NUM_DAYS){
            //Check if the revenue for the given day number is defined
            if(!Double.isNaN(this.dailyRevenues[dayNum-1])){
                //Return the revenue for the given day number
                return this.dailyRevenues[dayNum-1];
            }else {
                //Print an error message if the revenue is not defined
                System.out.println("No defined revenue amount for day#"+dayNum);
                //Return a NaN value
                return Double.NaN;
            }
        }else {
            //Print an error message if the given day number is invalid
            System.out.println("ERROR: Invalid day number "+dayNum);
            //Return a NaN value
            return Double.NaN;
        }
    }
    //This method sets the revenue for a given day number
    public void setRevenue(int dayNum, double value) {
        //Check if the given day number is within the range of the default number of days
        if(0<dayNum&&dayNum<=DEF_NUM_DAYS&&value>=0.0){
            //Set the revenue for the given day number
            this.dailyRevenues[dayNum-1] = value;
        }
    }
    public double getMonthlyAverage() {
        double sum =0.0;
        int counter =0;
        for (double dailyRevenue : this.dailyRevenues) {
            if (!Double.isNaN(dailyRevenue)) {
                sum += dailyRevenue;
                counter+=1;
            }
        }
        return sum/counter;
    }
    //This method returns the day number with the highest revenue
public double getDayNumberWithHighestRevenue() {
        //Declare a double variable to store the maximum revenue
        double max = 0.0;
        //Declare an int variable to store the day number
        int dayNum=0;
        //Loop through the daily revenues
        for (int i = 0; i < this.dailyRevenues.length; i++) {
            //Check if the current revenue is greater than the maximum revenue and not a NaN
            if (this.dailyRevenues[i] > max & !Double.isNaN(this.dailyRevenues[i])) {
                //Set the maximum revenue to the current revenue
                max = this.dailyRevenues[i];
                //Set the day number to the current index + 1
                dayNum=i+1;
            }
        }
        //Return the day number
        return dayNum;
    }
    public String toString() {
        String content ="";
        content+="Month: "+this.monthName+"\n" +
                "Average revenue: "+this.getMonthlyAverage()+"\n" +
                "The highest revenue was at day#"+getDayNumberWithHighestRevenue()+"\n" +
                "Revenue amount per day:";
        for (int i = 0; i < this.dailyRevenues.length; i++) {
            //Check if the value is not a number
            if(!Double.isNaN(this.dailyRevenues[i])){
                //Add the value to the content
                content+="\t"+(i+1)+": "+this.dailyRevenues[i];
            }
        }
        //Return the content
        return content;
    }
}
