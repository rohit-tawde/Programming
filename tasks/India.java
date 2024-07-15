class DhirubaiAmani {

    String company = "Reliance Industry"; // states

    public void thinkingStyle() // behaviours
    {
        System.out.println("Dhirubai Ambani Unique Style");
    }
    
}
class MukeshAmbani extends DhirubaiAmani {

}
// driver class
class India {
    public static void main(String[] args) {

        MukeshAmbani ref = new MukeshAmbani();
        System.out.println("Company Name: " + ref.company);
        ref.thinkingStyle();

    }
}
