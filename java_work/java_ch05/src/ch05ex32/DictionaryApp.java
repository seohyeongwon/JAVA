package ch05ex32;

public class DictionaryApp {

	   public static void main(String[] args) {
	      Dictionary dic = new Dictionary(10);
	      dic.put("황기태", "자바");
	      dic.put("이재문", "파이선");
	      dic.put("이재문", "C++");
//	      dic.put("황기태4", "자바");
//	      dic.put("이재문5", "파이선");
//	      dic.put("이재문6", "C++");
//	      dic.put("황기태7", "자바");
//	      dic.put("이재문8", "파이선");
//	      dic.put("이재문9", "C++");
//	      dic.put("황기태10", "자바");
//	      dic.put("이재문11", "파이선");
//	      dic.put("이재문12", "C++");
	      System.out.println("이재문의 값은 " + dic.get("이재문"));
	      System.out.println("황기태의 값은 " + dic.get("황기태"));
	      dic.delete("황기태");
	      System.out.println("황기태의 값은 " + dic.get("황기태"));
	   }
	}