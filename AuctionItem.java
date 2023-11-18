// Andrew Shaffer (G00688109)
import java.util.ArrayList;
import java.util.List;

public class AuctionItem {
	private  int itemNumber;
	private  String itemName;
	private int highestBid;
	private String highestBidder;
	private List<Bid> lista;
	private boolean paymentApproved;

	public AuctionItem(int itemNum, String name)
	{
		itemNumber = itemNum;
		itemName = name;
		highestBid = 0;
		highestBidder = null;
		lista = new ArrayList<>();
		paymentApproved = false;
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

	//this method will create a new bid that comes from the server. This is an object type BID, inserted in the list created in this class
	public void addBid(String nome, int valor) {
		Bid bid = new Bid(nome, valor);
		lista.add(bid);
	}
	
	//this method will return the list so it can be printed.
	public List<Bid> printLista() {
		return lista;
	}
	
	public int bidsize() {
		return lista.size();
	}
	
	public boolean isPaymentApproved() {
		return paymentApproved;
	}
	
	public void approvePayment() {
		paymentApproved = true;
	}

}