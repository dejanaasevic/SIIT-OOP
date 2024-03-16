package vezbe_03;

public class zad_3_1_a {

	public static void main(String[] args) {
		String tekst = "Norvezanin Kjetil Jansrud osvojio je zlatnu medalju u superveleslalomu na Zimskim \r\n"
				+ "olimpijskim igrama u Sociju posto je za 30 stotih delova sekunde bio brzi od \r\n"
				+ "drugoplasiranog Amerikanca Endrjua Vajbrehta. ";
		for (int i = tekst.length()-1; i >= 0; i--) {
			if(Character.isLetter(tekst.charAt(i))){
				System.out.print(tekst.charAt(i));
			}				
		}
	}
}
