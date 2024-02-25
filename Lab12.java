package CSCI1228;

public class Lab12 {
    public static void main(String[] args) {
        CanadianAddress testAddress = new CanadianAddress();
        CanadianAddress SMUAddress = new CanadianAddress("923 Robie Street", "Halifax", "NS", "B3H 3C3");
        testAddress.printAddress();
        System.out.println();
        SMUAddress.printAddress();
        System.out.println();
        System.out.println("is the TestAddress equal to SMUAddress ?"+SMUAddress.testAddress(testAddress));
        testAddress.setCity("Halifax");
        testAddress.setProvince("NS");
        testAddress.setPostalCode("B3H 3C3");
        testAddress.setStreetAddress("923 Robie Street");
        System.out.println("the testAddress is upadated as:");
        testAddress.printAddress();
        System.out.println("is the TestAddress equal to SMUAddress ?"+SMUAddress.testAddress(testAddress));
    }
    static class CanadianAddress{
        private String streetAddress;
        private String city;
        private String province;
        private String postalCode;

        public CanadianAddress() {
        }
        public CanadianAddress(String streetAddress, String city, String province, String postalCode) {
            this.streetAddress = streetAddress;
            this.city = city;
            this.province = province;
            this.postalCode = postalCode;
        }

        /**
         *
         * @return streetAddress
         */
        public String getStreetAddress() {
            return streetAddress;
        }

        /**
         *
         * @param streetAddress
         * streetAddress
         */
        public void setStreetAddress(String streetAddress) {
            this.streetAddress = streetAddress;
        }

        /**
         *
         * @return city
         */
        public String getCity() {
            return city;
        }
        public void setCity(String city) {
            this.city = city;
        }

        /**
         *
         * @return province
         */
        public String getProvince() {
            return province;
        }

        /**
         *
         * @param province
         * set province
         */
        public void setProvince(String province) {
            this.province = province;
        }

        /**
         *
         * @return postalCode
         */
        public String getPostalCode() {
            return postalCode;
        }

        /**
         *
         * @param postalCode
         * update postalCode
         */
        public void setPostalCode(String postalCode) {
            this.postalCode = postalCode;
        }

        public void printAddress() {
            System.out.println(streetAddress+", "+city+",\n"+province+" "+postalCode+", Canada");
        }
        public boolean testAddress(CanadianAddress address){
            if(address == null){
                return false;
            }else{
                return (this.city.equals(address.getCity()) &&this.province.equals(address.getProvince()) && this.postalCode.equals(address.getPostalCode()));
            }
        }
    }
}
