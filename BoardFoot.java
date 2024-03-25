import java.util.Scanner;

/**
 * Asks the user for the width and height to calculate.
 * The length of a board foot with the volume of 144^3 inches.
 *
 *
 * @author Jessah
 * @version 1.0 @2024-03-22
 */
public final class BoardFoot {

  /** Private constructor to prevent instantiation of this utility class. */
  private BoardFoot() {
    // whitespace
  }

  /**
   * Constant for volume.
   *
   * @value Constants.VOLUME
   */
  static final int VOLUME = 144;

  /**
   * Calculates the length of a board.
   *
   * @param width The width of the board.
   * @param height The height of the board.
   * @return Returns value.
   */

  // Calculates board length with 144 inches^3 volume.
  public static double calculateBoardFoot
  (final double width, final double height) {
    // Calculate length.
    final double length = (width * height) * VOLUME;
    // Return the length.
    return length;
  }

  /**
   * Main program.
   *
   * @param args Command-line arguments (not used in program).
   */

  // Main program.
  public static void main(final String[] args) {
    // Create a scanner for input.
    final Scanner scanner = new Scanner(System.in);

    // Greeting/Title.
    System.out.println("This program calculates the length of a board");
    System.out.println("that is determined by 1 board foot or 144^3 inches");

    // Get user input for width and height.
    System.out.print("Enter the width (inches):");
    final String userWidthString = scanner.nextLine();
    System.out.print("Enter the height (inches):");
    final String userHeightString = scanner.nextLine();

    // Check if user entered any strings.
    try {
      final double userWidth = Double.parseDouble(userWidthString);
      final double userHeight = Double.parseDouble(userHeightString);

      // Check if user entered negative numbers
      if (userWidth > 0 && userHeight > 0) {

        // Call CalculateBoardFoot function.
        final double calculate = calculateBoardFoot(userWidth, userHeight);

        // Display board length to user.
        System.out.println("The length of your board foot will be ");
        System.out.println(calculate + " inch(es) long");
      } else {
        // Display if user enters a negative number.
        System.out.println("Numbers cannot be below or equal to 0.");
      }

    } catch (NumberFormatException error) {
      // Display if user enters a string.
      System.out.println("Values cannot be strings");
    }
    scanner.close();
  }
}
