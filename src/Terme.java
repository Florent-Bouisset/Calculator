/**
 * Cette classe d�fini un terme d'une �quation, ex: 26/3; les termes sont 26; /; 3
 * Les operateurs sont consid�r�s comme des termes
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
