package vezbe_03;

public class zad_3_1_b {

	public static void main(String[] args) {
		String tekst = "Norvežanin Kjetil Jansrud osvojio je zlatnu medalju u superveleslalomu na Zimskim \r\n"
				+ "olimpijskim igrama u Sočiju pošto je za 30 stotih delova sekunde bio brži od \r\n"
				+ "drugoplasiranog Amerikanca Endrjua Vajbrehta.";
		
		String [] reci  = tekst.split(" ");
		for (int i = reci.length -1; i >= 0; i--) {
			System.out.println(reci[i]);
		}
	}
}
