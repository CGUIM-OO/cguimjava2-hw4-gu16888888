import java.util.ArrayList;

public class Player {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		
	}	
	private String name;//玩家姓名
	private int chips;//玩家有的籌碼
	private int bet;//玩家此局下注的籌碼
	private ArrayList oneRoundCard;//此牌局的卡
	public Player(String name, int chips){
		
	}//Player constructor，新增Player物件時，需要姓名、擁有的籌碼等兩個參數
	
	public String getName(){
	//name的getter
	return name;
		}
	public int makeBet(){
	/*下注，回傳預計下注的籌碼
	基本下注：一次1元
	如
	bet=1;*/
	return bet;
	//注意：要檢查是否還有錢，沒錢了就不能再繼續下注
	}
	public void setOneRoundCard(ArrayList cards){
	//設定此牌局所得到的卡 setter
	//oneRoundCard=cards;
	}
	public boolean hitMe(){
	/*是否要牌，是回傳true，不再要牌則回傳false
	基本參考條件：16點以下要牌，17點以上不要牌
	提示：用oneRoundCard來算*/
		boolean result=true;
		return result;//瞎写的
	}
	public int getTotalValue(){
	//回傳此牌局所得的卡點數加總
		return 0;
	}
	public int getCurrentChips(){
	//回傳玩家現有籌碼
		return 0;
	}
	public void increaseChips (int diff){
	//玩家籌碼變動，setter
	}
	public void sayHello(){
	//玩家Say Hello
	
	System.out.println("Hello, I am " + name + ".");
	System.out.println("I have " + chips + " chips.");}
}
