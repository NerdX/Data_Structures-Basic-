package Java_CollectionFrameWork.hashmaps;

import java.util.HashSet;
import java.util.Set;

class Pen{
	
	int Price;
	String Color;
	
			Pen(String C, int P) {
			this.Color = C;
			this.Price = P;
		}

			@Override
			public int hashCode() {
				final int prime = 31;
				int result = 1;
				result = prime * result + ((Color == null) ? 0 : Color.hashCode());
				result = prime * result + Price;
				return result;
			}

			@Override
			public boolean equals(Object obj) {
				if (this == obj)
					return true;
				if (obj == null)
					return false;
				if (getClass() != obj.getClass())
					return false;
				Pen other = (Pen) obj;
				if (Color == null) {
					if (other.Color != null)
						return false;
				} else if (!Color.equals(other.Color))
					return false;
				if (Price != other.Price)
					return false;
				return true;
			}
			
			//Custom Implementation Of equals() Method: - 
//			@Override
//			public boolean equals(Object obj) {
//				
//				Pen Temp = (Pen) obj;
//				
//				boolean isEquals = false;
//				
//				if(this.Color.equals(Temp.Color) && this.Price == Temp.Price) {
//					isEquals = true;
//					return(isEquals);
//				}
//				else {
//					return(isEquals);
//				}
//				
//			}
//			
//			//Custom Implementation Of hashCode() Method: - 
//			@Override
//			public int hashCode() {
//				
//				return (Price + Color.hashCode());
//				
//			}
			
}

public class HashCode_And_Equals_Methods {

	public static void main(String[] args) {
		
		Pen P1 = new Pen("Blue",10);
		Pen P2 = new Pen("Blue",10);
		
		System.out.println(P1);
		System.out.println(P2);
		
		Set<Pen> pens = new HashSet<Pen>();
		pens.add(P1);
		pens.add(P2);
		
		System.out.println(pens);
		
	}
	
}
