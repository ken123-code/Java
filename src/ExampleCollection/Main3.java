package ExampleCollection;

import javax.lang.model.type.ArrayType;
import java.awt.*;
import java.util.*;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main3 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        // truy cap phan tu tại vị trí chỉ định
        System.out.println(colors.get(1));

        // Thay đổi phần tử tại vị trí chi định
        colors.set(1, "Yellow");

        // Xóa phần tử theo giá trị
        colors.remove("Red");
        System.out.println(colors);

        // Xoa phan tu theo chi so
        colors.remove(1);
        System.out.println(colors);

        for (String color : colors){
            System.out.println(color);
        }

        // System.out.printf(colors)
        // Tao 1 mang
        String[] colorsArray ={"red","Green","Blue"};

        // Tao ArrayList từ mảng
        ArrayList<String> colorsList = new ArrayList<>(Arrays.asList(colorsArray));

        // Sap xep mang: cach thuong
        Collections.sort(colorsList);

        // su dung bieu thuc lambda de sap xep danh sach theo thu tu tang dan
        Collections.sort(colorsList,(s1,s2)->s1.compareTo(s2));
        System.out.println(colorsList); // output: [red,green,blue]

//        ArrayList<Point> points =  new ArrayList<>();
//        points.add(new Point(3,7));
//        points.add(new Point(3,6));
//        points.add(new Point(5,2));

        Comparator<Point> x_y_compare = new Comparator<Point>() {
            @Override
            public int compare(Point o1, Point o2) {
                return Integer.compare(o1.getX()+o1.getY(),o2.getX()+o2.getY());
            }
        };

//        Collections.sort(points, x_y_compare);
//        for(Point p: points){
//            System.out.println(p);
//        }

        System.out.println("##################################");
        ArrayList<Point> points =  new ArrayList<>();
        points.add(new Point(3,5));
        points.add(new Point(2,6));
        points.add(new Point(5,2));
        points.add(new Point(6,0));
        System.out.println("Predicate ##################################");
        Predicate<Point> SumPoint = point -> point.getX() + point.getY() > 7;

        Predicate<Point> SumPoint2 = point -> {
            if(point.getX() > 5){
                return point.getX() + point.getY() > 7;
            } else {
                return point.getX() + point.getY() > 6;
            }
        };

        for(Point point : points){
            if(SumPoint2.test(point)){
                System.out.println(point.toString());
            }
        }
        Function<Point,Integer> sumPoint3 = p -> p.getY() + p.getX();

        Function<Point,Integer> sumPoint4 = p -> {
            return p.getX() > p.getY() ? p.getY() - p.getX() : p.getY() + p.getX();
        };

        for (Point point : points) {
            System.out.println(sumPoint4.apply(point));
        }

        Consumer<Point> printMessage = p -> {
            if(p.getX() > p.getY()) {
                System.out.println(p.getY() - p.getX());
            } else {
                System.out.println(p.getY() + p.getX());
            }
        };

        System.out.println(("###########################"));
        points.forEach(printMessage);
        System.out.println(("###########################"));
        for(Point point : points){
            printMessage.accept(point);
        }

        System.out.println(("###########################"));
        points.stream()
                .filter(p -> p.getX() > 3)
                .forEach(System.out::println);
        System.out.println(("###########################"));
        for(Point a:points){
            if(a.getX()>3){
                System.out.println(a.toString());
            }
        }
        System.out.println(("###########################"));
        Predicate<Point> pre_x = point -> point.getX() > 3;
        for(Point point : points){
            if(pre_x.test(point)){
                System.out.println(point.toString());
            }
        };
        System.out.println(("###########################"));;
        Consumer<Point> consum_x = p -> {
            if(p.getX() > 3){
                System.out.println(p.toString());
            }
        };
        points.forEach(consum_x);

        System.out.println(("###########################"));

        List<String> names = Arrays.asList("John1","John2","John3","John4");

        names.stream()
                .filter(name -> name.startsWith("A"))
                .forEach(System.out::println);

        List<String> filteredNames = names.stream()
                .filter(name -> name.startsWith("A"))
                .map(String::toUpperCase)
                .sorted()
                .collect(Collectors.toList());

        System.out.println(filteredNames);

        names.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);

        names.stream()
                .sorted()
                .forEach(System.out::println);

        names.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);

        List<Integer> numbers = Arrays.asList(1,2,3,4,5);

        int sum = numbers.stream()
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("Sum: "+sum);

        double average = numbers.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0);

        System.out.println("Average: " + average);

        OptionalInt max = numbers.stream()
                .mapToInt(Integer::intValue)
                .max();

        System.out.println("Max: "+ (max.isPresent()?max.getAsInt():"Not present"));

        OptionalInt min = numbers.stream()
                .mapToInt(Integer::intValue)
                .min();

        System.out.println("Max: "+ (min.isPresent()?min.getAsInt():"Not present"));

        int sum1 = numbers.stream()
                .reduce(0,Integer::sum);
        System.out.println("Sum using reduce: "+ sum1);

        int product = numbers.stream()
                .reduce(1,(kq,item)-> kq*item);
        System.out.println("Sum using reduce: "+ sum1);

        List<List<String>> listOfLists = Arrays.asList(
                Arrays.asList("a","b","c"),
                Arrays.asList("d","e","f"),
                Arrays.asList("g","h","i")
        );

        List<String> combinedList = listOfLists.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());
    }
}
