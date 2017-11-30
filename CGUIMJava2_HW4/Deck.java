import java.util.ArrayList;
import java.util.Random;

	
		// TODO 自动生成的方法存根	
	public	class Deck{
		
		

			private ArrayList<Card> cards;
			//TODO: Please implement the constructor (30 points)
			public Deck(int nDeck){
				cards=new ArrayList<Card>();
				//1 Deck have 52 cards, https://en.wikipedia.org/wiki/Poker
				//Hint: Use new Card(x,y) and 3 for loops to add card into deck
				//Sample code start
				//Card card=new Card(1,1); ->means new card as clubs ace
				//cards.add(card);
				//Sample code end
				for (int deck=1;deck<=nDeck;deck++){//几副牌
					for (Card.Suit s : Card.Suit.values()){//花色
						for(int Rank=1;Rank<=13;Rank++){//大小
							Card card=new Card(s,Rank);
							cards.add(card);//将新实体化的card加到清单（cards）里面
						}
					}
				}shuffle();//洗牌
				

			}	
			//TODO: Please implement the method to print all cards on screen (10 points)
			
				public ArrayList<Card> getAllCards(){
				return cards;
			}
				
			    public ArrayList<Card> usedCard;
			    
			    public int nUsed;
			    public void shuffle(){
			    	usedCard=new ArrayList<Card>();//将usedCard实体化
			    	for(int i=52;i>0;i--){
			    	Random n = new Random(); 
			    	int x=n.nextInt(i);
			    	Card card=new Card(cards.get(x).getSuit(),cards.get(x).getRank());
			    	
			    	usedCard.add(cards.get(x));
			    	cards.remove(cards.get(x));
			    	
			    	}nUsed=0;
			    	cards.addAll(usedCard);
			    	usedCard.removeAll(usedCard);
			    }//循环在i张（i由52递减）cards中随机抽一张牌放到usedCard中暂存，并将此牌从cards里移除，连续52次完成洗牌动作。最后洗牌完成后还要将usedCard里面的牌add到cards里面，清空usedCard
			    
			    
			    		    
			    public Card getOneCard(){
			    	if(nUsed==52)//当52张牌发完了
			    		shuffle();//洗牌
			    	nUsed++;//每发一次牌，nUsed++
			    	Card card=new Card(cards.get(0).getSuit(),cards.get(0).getRank());	//每次都发最上面的牌		    	
			    	cards.add(cards.get(0));cards.remove(cards.get(0));//将发的最上面的牌放到最下面
			    	return card;
			    }

	}


