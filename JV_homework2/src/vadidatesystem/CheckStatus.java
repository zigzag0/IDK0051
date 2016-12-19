package vadidatesystem;

public class CheckStatus implements Check {

	@Override
	public boolean kontrolli(String koolitunnus, String isikukood) {
		if ((koolitunnus.equals("MHG") || koolitunnus.equals("KARDLA") || koolitunnus.equals("NOO")
				|| koolitunnus.equals("REAAL")) && (isikukood.startsWith("5") || isikukood.startsWith("6"))) {
			return true;
		}
		return false;
		// TODO Auto-generated method stub

	}

}
