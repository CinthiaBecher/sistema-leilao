// Andrew Shaffer (G00688109)
import java.util.ArrayList;
import java.util.List;


public class AuctionItem {
	private  int itemNumber;
	private  String itemName;
	private int highestBid;
	private String highestBidder;
	private List<Bid> lista;

	public AuctionItem(int itemNum, String name)
	{
		itemNumber = itemNum;
		itemName = name;
		highestBid = 0;
		highestBidder = null;
		lista = new ArrayList<>();
	}

	public int getItemNumber()
	{ return itemNumber;}

	public void setItemNumber(int num)
	{ itemNumber = num; }

	public String getItemName()
	{ return itemName;}

	public void setItemName(String name)
	{ itemName = name; }

	public int getHighestBid()
	{ return highestBid;}

	public void setHighestBid(int num)
	{ highestBid = num; }

	public String getHighestBidder()
	{ return highestBidder;}

	public void setHighestBidder(String name)
	{ highestBidder = name; }
	
	//get maior bidder - return name and valor
	//get lista inteira
	//receber bid

	
	public void addBid(String nome, int valor) {
		Bid bid = new Bid(nome, valor);
		
		lista.add(bid);
		
		for(Bid elemento : lista) {
			System.out.println(elemento.getNome() + " " + elemento.getValor());
		}
	}
	
	public void printLista() {
		for(Bid elemento : lista) {
			System.out.println(elemento.getNome() + " " + elemento.getValor());
		}
	}

}