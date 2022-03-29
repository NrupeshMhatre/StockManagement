package stockmanagement;

public class StockGetSet 
{
	private String stockName;
	private int share;
	private long sharePrice;

	
	public String getStockName()
	{
		return stockName;
	}
	public void setStockName(String stockName)
	{
		this.stockName = stockName;
	}
	public int getShare() 
	{
		return share;
	}
	public void setShare(int share)
	{
		this.share = share;
	}
	public long getSharePrice() 
	{
		return sharePrice;
	}
	public void setSharePrice(long sharePrice) 
	{
		this.sharePrice = sharePrice;
	}
	public StockGetSet(String stockName, int share, long sharePrice) {
		super();
		this.stockName = stockName;
		this.share = share;
		this.sharePrice = sharePrice;
	}
	public StockGetSet() {
		
	}
}
