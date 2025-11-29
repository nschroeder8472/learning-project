/// Exercise 3: Number of Islands
/// Difficulty: Medium
///
/// Given a 2D grid of '1's (land) and '0's (water), count the number of islands.
/// An island is surrounded by water and formed by connecting adjacent lands horizontally or vertically.
/// You may assume all four edges of the grid are surrounded by water.
///
/// # Examples
///
/// ```
/// use algorithms::graph_traversal::ex3_number_of_islands::num_islands;
///
/// let grid = vec![
///     vec!['1','1','0','0','0'],
///     vec!['1','1','0','0','0'],
///     vec!['0','0','1','0','0'],
///     vec!['0','0','0','1','1']
/// ];
/// assert_eq!(num_islands(&grid), 3);
/// ```
///
/// Time Complexity: O(rows * cols) - visit each cell once
/// Space Complexity: O(rows * cols) - worst case recursion depth for DFS

/// Counts the number of islands in the grid.
///
/// # Arguments
///
/// * `grid` - 2D grid of '1's (land) and '0's (water)
///
/// # Returns
///
/// Number of islands
pub fn num_islands(grid: &Vec<Vec<char>>) -> i32 {
    // TODO: Implement island counting
    // Hint: Iterate through grid, when you find '1', increment count and DFS to mark entire island
    // Hint: Mark visited cells by changing '1' to '0' or use a separate visited set
    unimplemented!("Not implemented yet")
}

/// Helper function to perform DFS and mark all connected land cells.
fn dfs(grid: &mut Vec<Vec<char>>, row: usize, col: usize) {
    // TODO: Implement DFS to mark connected land cells
    // Hint: Check boundaries, check if current cell is water or already visited
    // Hint: Mark current cell as visited, then recursively visit all 4 neighbors
    unimplemented!("Not implemented yet")
}

/// Alternative solution using BFS instead of DFS.
///
/// # Arguments
///
/// * `grid` - 2D grid of '1's (land) and '0's (water)
///
/// # Returns
///
/// Number of islands
pub fn num_islands_bfs(grid: &Vec<Vec<char>>) -> i32 {
    // TODO: Implement island counting using BFS
    // Hint: Use a VecDeque to perform BFS when an island is found
    unimplemented!("Not implemented yet")
}

#[cfg(test)]
mod tests {
    use super::*;

    #[test]
    fn test_three_islands() {
        let grid = vec![
            vec!['1', '1', '0', '0', '0'],
            vec!['1', '1', '0', '0', '0'],
            vec!['0', '0', '1', '0', '0'],
            vec!['0', '0', '0', '1', '1'],
        ];
        assert_eq!(num_islands(&grid), 3);
    }

    #[test]
    fn test_one_island() {
        let grid = vec![
            vec!['1', '1', '1', '1', '0'],
            vec!['1', '1', '0', '1', '0'],
            vec!['1', '1', '0', '0', '0'],
            vec!['0', '0', '0', '0', '0'],
        ];
        assert_eq!(num_islands(&grid), 1);
    }

    #[test]
    fn test_no_islands() {
        let grid = vec![
            vec!['0', '0', '0'],
            vec!['0', '0', '0'],
            vec!['0', '0', '0'],
        ];
        assert_eq!(num_islands(&grid), 0);
    }

    #[test]
    fn test_all_island() {
        let grid = vec![vec!['1', '1'], vec!['1', '1']];
        assert_eq!(num_islands(&grid), 1);
    }

    #[test]
    fn test_single_cell() {
        let grid = vec![vec!['1']];
        assert_eq!(num_islands(&grid), 1);
    }

    #[test]
    fn test_single_cell_water() {
        let grid = vec![vec!['0']];
        assert_eq!(num_islands(&grid), 0);
    }

    #[test]
    fn test_diagonal_islands() {
        let grid = vec![
            vec!['1', '0', '1'],
            vec!['0', '1', '0'],
            vec!['1', '0', '1'],
        ];
        assert_eq!(num_islands(&grid), 5);
    }

    #[test]
    fn test_bfs_version() {
        let grid = vec![
            vec!['1', '1', '0', '0', '0'],
            vec!['1', '1', '0', '0', '0'],
            vec!['0', '0', '1', '0', '0'],
            vec!['0', '0', '0', '1', '1'],
        ];
        assert_eq!(num_islands_bfs(&grid), 3);
    }
}
