package InheritanceLecture;

    public class Ingredient {

        public static String brandName;
        public static boolean isSugarFree;
        protected static int calories; //sub class method works with  protected if it is in the same package, not working with private

        public Ingredient() {
        }

        public String getBrandName() {
            return brandName;
        }
        public void setBrandName(String brandName) {
            this.brandName = brandName;
        }

        public boolean isSugarFree() {
            return isSugarFree;
        }

        public void setSugarFree(boolean sugarFree) {
            isSugarFree = sugarFree;
        }
        public void throwAway (){
            System.out.println("Throwing away ingredient...!");
        }
    }
