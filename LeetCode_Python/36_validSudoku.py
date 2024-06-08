from typing import List
from collections import defaultdict

class ValidSudoku:
    def validSudoku(self, board : List[List[str]]) -> bool:
        rowsDict = defaultdict(set)
        colsDict = defaultdict(set)
        squaresDict = defaultdict(set)

        for i in range(len(board)):
            for j in range(len(board[0])):

                if board[i][j] == '.':
                    continue

                if (
                    board[i][j] in rowsDict[i] or
                    board[i][j] in colsDict[j] or
                    board[i][j] in squaresDict[i // 3, j // 3] 
                ):
                    return False
                
                rowsDict[i].add(board[i][j])
                colsDict[j].add(board[i][j])
                squaresDict[(i//3,j//3)].add(board[i][j])

        
        return True
    
if __name__ == "__main__":
    solution = ValidSudoku()
    board = [
         ["5","3",".",".","7",".",".",".","."]
        ,["6",".",".","1","9","5",".",".","."]
        ,[".","9","8",".",".",".",".","6","."]
        ,["8",".",".",".","6",".",".",".","3"]
        ,["4",".",".","8",".","3",".",".","1"]
        ,["7",".",".",".","2",".",".",".","6"]
        ,[".","6",".",".",".",".","2","8","."]
        ,[".",".",".","4","1","9",".",".","5"]
        ,[".",".",".",".","8",".",".","7","9"]
    ]

    print(solution.validSudoku(board))

                

                
                