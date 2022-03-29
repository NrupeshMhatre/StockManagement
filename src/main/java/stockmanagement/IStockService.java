package stockmanagement;

public interface IStockService 
{
	void addstocks(String stockName, int share, long sharePrice);
	void printReport();
}
