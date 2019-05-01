package com.sandbox.services;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.sandbox.enums.Options;

public class NameUtils {
	
	public static final String NAME_DELIMITER = "-";
	public static final String format3 = "%s-%s-%s";
	public static final String format4 = "%s-%s-%s-%s";
	public static final String format5 = "%s-%s-%s-%s-%s";
	
	public static String getNameWithStringJoiner(Options o) {
		List<Enum<?>> enumTypeList = Arrays.asList(o.getA(), o.getB(), o.getC(), o.getD(), o.getE());
		
		int indexOfLastNonNull = enumTypeList.size();
		while(enumTypeList.get(--indexOfLastNonNull) == null);
			
		String name = enumTypeList.subList(0, indexOfLastNonNull + 1).stream()
				.map(enumType -> enumType==null ? "null" : enumType.name())
				.collect(Collectors.joining(NAME_DELIMITER));
		
		return name;
	}
	
	public static String getNameWithStringBuilder(Options o) {
		List<Enum<?>> enumTypeList = Arrays.asList(o.getA(), o.getB(), o.getC(), o.getD(), o.getE());
		
		int indexOfLastNonNull = enumTypeList.size();
		while(enumTypeList.get(--indexOfLastNonNull) == null);
		
		StringBuilder sb = new StringBuilder();
		for (int i = 0 ; i < indexOfLastNonNull ; i++) {
			Enum<?> enumType = enumTypeList.get(i);
			String enumName = enumType == null ? "null" : enumType.name();
			sb.append(enumName).append(NAME_DELIMITER);
		}
		sb.append(enumTypeList.get(indexOfLastNonNull));
		return sb.toString();
	}
	
	public static String getNameWithStringFormattor(Options o) {
		String name = null;
		if ( o.getE() != null ) {
			name = String.format(format5, o.getA(), o.getB(), o.getC(), o.getD(), o.getE());
		} else if ( o.getD() != null ) {
			name = String.format(format4, o.getA(), o.getB(), o.getC(), o.getD());
		} else if ( o.getC() != null ) {
			name =String.format(format3, o.getA(), o.getB(), o.getC());
		}
		return name;
	}

}
