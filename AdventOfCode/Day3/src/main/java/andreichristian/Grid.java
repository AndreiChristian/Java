package andreichristian;

        import java.util.ArrayList;
        import java.util.List;
        import java.util.stream.Collectors;

public class Grid {

    public static List<List<Boolean>> funcInit(List<String> lines) {

        return lines.stream()
                .map(line -> line.chars()
                        .mapToObj(c -> c == '#')
                        .collect(Collectors.toList()))
                .collect(Collectors.toList());
    }

    public static long traverse(List<List<Boolean>> grid, int rowStep, int colStep ){

        long trees = 0;
        int row=0, col = 0;

        while (row<grid.size()){

            if(grid.get(row).get(col)){
                trees ++;
            }
            col = (col + colStep)%grid.get(0).size();
            row +=rowStep;

        }

        return trees;

    }

    static void checkMutlipleOptions(List<String> lines ){

        List<List<Boolean>> grid = funcInit(lines);

        ArrayList<Long> results = new ArrayList<>();

        results.add(traverse(grid, 1,1));
        results.add(traverse(grid, 1,3));
        results.add(traverse(grid, 1,5));
        results.add(traverse(grid, 1,7));
        results.add(traverse(grid, 2,1));

        long product = 1;
        for(Long r:results){

            product *=r;

        }

        System.out.println(product);
    }
}

