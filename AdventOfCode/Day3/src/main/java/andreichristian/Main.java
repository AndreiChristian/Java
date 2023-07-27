package andreichristian;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> lines = IOReaderUtil.ReadFile("input.txt");

        if(lines == null){
            System.out.println("Error reading file");
            return;
        }

//        List<List<Boolean>> grid = Grid.funcInit(lines);
//
//       int result = Grid.traverse(grid,1,3 );

//       System.out.println(result);

        Grid.checkMutlipleOptions(lines);



    }
}