package org.com.ch15ex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Saram implements Comparable<Saram> {
   private int seq;
   private String id;
   private String name;
   private String email;
   private int nai;
   
   public Saram() {
      this(0, "","","");
   }
   
   public Saram(int seq) {
      this(seq, "", "", "");
   }

   public int getNai() {
      return nai;
   }

   public void setNai(int nai) {
      this.nai = nai;
   }

   public Saram(String id, String name, String email) {
      this(0, id, name, email);
   }

   public Saram(int seq, String id, String name, String email) {
      this.seq = seq;
      this.id = id;
      this.name = name;
      this.email = email;
   }

   public Saram(int seq, String id, String name, String email, int nai) {
      this.seq = seq;
      this.id = id;
      this.name = name;
      this.email = email;
      this.nai = nai;
   }

   public int getSeq() {
      return seq;
   }

   public void setSeq(int seq) {
      this.seq = seq;
   }

   public String getId() {
      return id;
   }

   public void setId(String id) {
      this.id = id;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getEmail() {
      return email;
   }

   public void setEmail(String email) {
      this.email = email;
   }

   @Override
   public String toString() {
      // 문자열 안에 특수문자 : 이클립스가 자동으로 역슬래시(\) 붙여준다.
      return String.format("{\"seq\":%d,\"id\":\"%s\",\"name\":\"%s\",\"email\":\"%s\",\"nai\":\"%d\"}", seq, id, name, email, nai);
   }

   // 이하부정관 (배나무 아래서 갓 고쳐 쓰지 말라. 참외밭에서 신발끈 고쳐 매지 말라.)
   // 컬렉션에 저장된 요소를 검색하기 위해 hashCode, equals 필요하다.
   @Override
   public int hashCode() {
      final int prime = 31;
      int result = 1;
      result = prime * result + seq;
      return result;
   }

   @Override
   public boolean equals(Object obj) {
      if (obj instanceof Saram) {
         Saram saram  = (Saram)obj;
         if(saram.seq == this.seq) {
            return true;
         }
      }
      
      return false;
      
//      if (this == obj)
//         return true;
//      if (obj == null)
//         return false;
//      if (getClass() != obj.getClass())
//         return false;
//      Saram other = (Saram) obj; // 다운캐스팅
//      if (this.seq != other.seq)
//         return false;
//      return true;
   }

@Override
public int compareTo(Saram o) {
	// TODO Auto-generated method stub
	return 0;
}

//   @Override
//   public int compareTo(Saram o) {
      // 이름순으로 정렬 되도록 한다.
//      if(this.nai > o.getNai()) {
//         return -1;
//      } else if(this.nai < o.getNai()) {
//         return 1;
//      } 
      
//      if(this.name.compareToIgnoreCase(o.getName()) > 0) {
//         return 1;
//      } else if(this.name.compareToIgnoreCase(o.getName()) < 0) {
//         return -1;
//      }
//      return 0;
//   }
}


public class ch15ex01 {

	public static void main1(String[] args) {
		Saram saram1 = new Saram(1, "kim", "김길동", "kim@daram.com");
		Saram saram2 = new Saram(1, "kim", "김길동", "kim@daram.com");

		if (saram1.equals(saram2)) {
			System.out.println("same");
		} else {
			System.out.println("no same");

		}
	}

	// ArrayList 같은 Collection에 저장된 객체를 검색 하기 위해
	// 중요 ★★★★ hashCode()와 equals()를 재 정의 해야 가능 하다.
	public static void main(String[] args) {
		  ArrayList<Saram> saramList = new ArrayList<Saram>();
	      saramList.add(new Saram(101, "kim","김길동", "kim@saram.com", 45));
	      saramList.add(new Saram(102, "lee","이길동2", "lee@saram.com", 27));
	      saramList.add(new Saram(103, "park","박길동3", "park@saram.com", 30));
	      saramList.add(new Saram(104, "hong","홍길동4", "hong@saram.com", 25));
	      saramList.add(new Saram(105, "jjang","장길동5", "jjang@saram.com", 33));
	      
	      // ArrayList 같은 Collection에 저장된 객체를 검색 하기 위해
	      // 중요: hashCode()와 equals()를 재 정의 해야 가능하다.
	      int seq = 104;
	      int findIdx = saramList.indexOf(new Saram(seq));
	      System.out.println(String.format("seq가 %d인 요소는 %d번째 index이다.", seq, findIdx));
	      System.out.println(saramList.get(findIdx));
	      System.out.println();
	      // 실습 : saramList의 요소를 나이순으로 정렬하라.
	      // Collections.sort(list)가 가능하게 하려면 Comparable를 활용하라.
	      Collections.sort(saramList, new Comparator<Saram>() {
	         @Override
	         public int compare(Saram o1, Saram o2) {
	            if(o1.getNai() > o2.getNai()) {
	               return -1;
	            } else if(o1.getNai() < o2.getNai()) {
	               return 1;
	            }
	            return 0;
	         }
	      });
	      
	      //Collections.sort(saramList);
	      
	      for(Saram saram: saramList) {
	         System.out.println(saram);
	      }
	   }

	
}
