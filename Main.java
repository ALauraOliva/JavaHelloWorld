class Main {
    public static void main(String[] args) {
        String name = "Andrea Laura";
        String country = "Peru";
        int age = 23;
        String company = "Best Company";
        double gpa = 3.8;
        char percentSign = '%';
        boolean amITellingTheTruth = true;
        /*
         * %s === String %d === int %f === double %c === char %b === boolean
         */
        String formattedString = String.format(
                "My name is %s. I am from %s. I am %d years old. I work for %s. My GPA is %f. I have attended 100%c of my university classes. These are all %b claims",
                name, country, age, company, gpa, percentSign,
                amITellingTheTruth);

        System.out.println(formattedString);
        System.out.println(formattedString.length());
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());

        String string1 = new String("abc");
        String string2 = new String("abc");

        System.out.println(string1 == string2);
        System.out.println(string1.equals(string2));
        System.out.println(name.contains("Laura"));
    }
}
