
import java.util.Date;

public class Block {

	public String hash;
	public String prevHash;
	private String data; 
	private long timeStamp; 

	public Block(String data,String previousHash ) {
		this.data = data;
		this.prevHash = previousHash;
		this.timeStamp = new Date().getTime();
	}
}