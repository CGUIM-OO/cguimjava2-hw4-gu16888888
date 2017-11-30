import java.util.ArrayList;
import java.util.Random;

	
		// TODO �Զ����ɵķ������	
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
				for (int deck=1;deck<=nDeck;deck++){//������
					for (Card.Suit s : Card.Suit.values()){//��ɫ
						for(int Rank=1;Rank<=13;Rank++){//��С
							Card card=new Card(s,Rank);
							cards.add(card);//����ʵ�廯��card�ӵ��嵥��cards������
						}
					}
				}shuffle();//ϴ��
				

			}	
			//TODO: Please implement the method to print all cards on screen (10 points)
			
				public ArrayList<Card> getAllCards(){
				return cards;
			}
				
			    public ArrayList<Card> usedCard;
			    
			    public int nUsed;
			    public void shuffle(){
			    	usedCard=new ArrayList<Card>();//��usedCardʵ�廯
			    	for(int i=52;i>0;i--){
			    	Random n = new Random(); 
			    	int x=n.nextInt(i);
			    	Card card=new Card(cards.get(x).getSuit(),cards.get(x).getRank());
			    	
			    	usedCard.add(cards.get(x));
			    	cards.remove(cards.get(x));
			    	
			    	}nUsed=0;
			    	cards.addAll(usedCard);
			    	usedCard.removeAll(usedCard);
			    }//ѭ����i�ţ�i��52�ݼ���cards�������һ���Ʒŵ�usedCard���ݴ棬�������ƴ�cards���Ƴ�������52�����ϴ�ƶ��������ϴ����ɺ�Ҫ��usedCard�������add��cards���棬���usedCard
			    
			    
			    		    
			    public Card getOneCard(){
			    	if(nUsed==52)//��52���Ʒ�����
			    		shuffle();//ϴ��
			    	nUsed++;//ÿ��һ���ƣ�nUsed++
			    	Card card=new Card(cards.get(0).getSuit(),cards.get(0).getRank());	//ÿ�ζ������������		    	
			    	cards.add(cards.get(0));cards.remove(cards.get(0));//��������������Ʒŵ�������
			    	return card;
			    }

	}


