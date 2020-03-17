/**
 * Cette classe défini un terme d'une équation, ex: 26/3; les termes sont 26; /; 3
 * Les operateurs sont considérés comme des termes
 */
public class Terme {
	private TermeType type;
	
	Terme(TermeType type){
		this.type = type;
	}
	
	
	TermeType getType() {
		return type;
	}
	
	
}
