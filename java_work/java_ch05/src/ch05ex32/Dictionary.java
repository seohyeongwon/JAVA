package ch05ex32;

public class Dictionary extends PairMap {

	   public Dictionary(int size) {
	      keys = new String[size];
	      values = new String[size];
	   }

	   @Override
	   String get(String key) {
	      for(int i=0; i<keys.length; i++) {
	         if(key.equals(keys[i])) {
	            return values[i];
	         }
	      }
	      return null;
	   }

	   @Override
	   void put(String key, String value) {
	      int cnt=0;
	      boolean flag = false;
	      for(; keys[cnt]!=null && cnt<keys.length; cnt++) {
	         if(key.equals(keys[cnt])) {
	            values[cnt] = value;
	            flag = true;
	            break;
	         }
	      }
	      if(!flag && cnt<keys.length) {
	         keys[cnt] = key;
	         values[cnt] = value;
	      } else {
	         String[] newKeys = new String[keys.length + 10];
	         String[] newValues = new String[values.length + 10];
	         for(int i=0; i<keys.length; i++) {
	            newKeys[i] = keys[i];
	            newValues[i] = values[i];
	         }
	         newKeys[cnt] = key;
	         newValues[cnt] = value;
	         keys = newKeys;
	         values = newValues;
	      }
	   }

	   @Override
	   String delete(String key) {
	      for(int i=0; i<keys.length; i++) {
	         if(key.equals(keys[i])) {
	            String tmpValue = values[i];
	            values[i] = null;
	            return tmpValue;
	         }
	      }
	      return null;
	   }

	   @Override
	   int length() {
	      int i=0;
	      for(;i<keys.length; i++) {
	         if(keys[i]==null) {
	            break;
	         }
	      }
	      return i;
	   }

	}