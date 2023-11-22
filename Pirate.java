/**
 * javabean class of Pirate
 *
 * @author Yilin Huang (A00475433)
 */
public class Pirate {
    private String name;
    private String dream;
    private int bounty;
    private static int highestBounty=0;

    public Pirate(String name, String dream, int bounty) {
        this.name = name;
        this.dream = dream;
        if(bounty>0){
            this.bounty = bounty;
        }else {
            System.out.println("Bounty must be greater than 0");
            this.bounty=0;
        }
        if(this.bounty>highestBounty){
            highestBounty=this.bounty;
        }
    }
    public Pirate(String name, String dream) {
        this(name,dream,0);
    }
    public Pirate() {
    }
    /**
     *
     * @return highestBounty
     */
    public static int getHighestBounty() {
        return highestBounty;
    }
    /**
     *
     * @param highestBounty
     */
    public static void setHighestBounty(int highestBounty) {
        Pirate.highestBounty = highestBounty;
    }
    /**
     *
     * @return name
     */
    public String getName() {
        return name;
    }
    /**
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     *
     * @return dream
     */
    public String getDream() {
        return dream;
    }
    public boolean isMostWantedPirate() {
        return this.bounty==highestBounty;
    }
    /**
     *
     * @return bounty
     */
    public int getBounty() {
        return bounty;
    }
    /**
     *
     * @param bounty
     */
    public void increaseBounty(int bounty) {
        if(bounty>0){
            this.bounty += bounty;
        }else{
            System.out.println("Bounty increase must be positive");
        }
        if(this.bounty>highestBounty){
            highestBounty=this.bounty;
        }
    }

    public String toString() {
        String content ="My name is: "+this.name+"\n" +
                "I have a dream: "+this.dream+"\n" +
                "World Govt wants "+this.bounty+"B for my head.";
        if(this.isMostWantedPirate()){
            content +=
                    "\nI am most wanted pirate!";
        }
        return content;
    }
}
