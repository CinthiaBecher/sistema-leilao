

public class BidItemController {
	private Bid bid;
	private AuctionItem item;
	
	public BidItemController(Bid bid, AuctionItem item) {
		super();
		this.bid = bid;
		this.item = item;
	}

	public Bid getBid() {
		return bid;
	}

	public void setBid(Bid bid) {
		this.bid = bid;
	}

	public AuctionItem getItem() {
		return item;
	}

	public void setItem(AuctionItem item) {
		this.item = item;
	}

	
}
