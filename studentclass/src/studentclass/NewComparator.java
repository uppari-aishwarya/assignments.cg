package studentclass;

import java.util.Comparator;

@SuppressWarnings("rawtypes")
public  class NewComparator implements Comparator {
 public int compare(student o1 , student o2) {
	// TODO Auto-generated method stub
	if( o1.getGrade()>o2.getGrade()){
		return 1;
	}
	return 0;
}

@Override
public int compare(Object o1, Object o2) {
	// TODO Auto-generated method stub
	return 0;
}
}

