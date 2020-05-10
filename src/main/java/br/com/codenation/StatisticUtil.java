package br.com.codenation;


import java.awt.*;
import java.util.*;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import static java.util.Arrays.asList;
public class StatisticUtil {

		public static int average(int[] elements) {
			System.out.println((int) Arrays.stream(elements).average().getAsDouble());
			return (int) Arrays.stream(elements).average().getAsDouble();
		}

		public static int mode(int[] elements) {

			int[] array = Arrays.stream(elements).sorted().toArray();
			int element = array[0], count = 1,
					highElement = element, highCount = 0;
			for (int i = 1; i < array.length; i++) {
				if (element == array[i] && i < array.length - 1) {
					count++;
				} else {
					if (count >= highCount) {
						highElement = element;
						highCount = count;
					}
					element = array[i];
					count = 1;
				}
			}
			return highElement;

		}

		public static int median(int[] elements) {

			int[] lista = Arrays.stream(elements).sorted().toArray();
			int size = lista.length;

			if( size % 2 == 1 ){
				System.out.println(lista[Math.floorDiv(size,2)]);
				return lista[Math.floorDiv(size,2)];
			}else{
				System.out.println((lista[Math.floorDiv(size,2)] + lista[(Math.floorDiv(size,2) - 1)]) / 2);
				return (lista[Math.floorDiv(size,2)] + lista[(Math.floorDiv(size,2) - 1)]) / 2;
			}
		}

		public static void main(String[] args){

			int[] elements = new int[]{2,4,5,6,7,7};
			mode(elements);
		}
	}

