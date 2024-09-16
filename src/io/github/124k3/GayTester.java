import javax.swing.JOptionPane;

/**
 * Class GayTester handles the GUI.
 *
 * @author izake
 * @version 1.1
 */
public class GayTester
{
    // constructor(s)
    /***/
    static int getQuestion(String x)
    {
        return (JOptionPane.showInternalConfirmDialog(
                null, x, "Gay Test", 1));
    }

    static void setReply(String message)
    {
        JOptionPane.showConfirmDialog(null, message, "Gay Test", 2);
    }

    public static void main(String[] args)
    {
        JOptionPane.showMessageDialog(
                null,
                "Welcome to the Gay test",
                "Gay Test",
                1
        );
        int answer = JOptionPane.showConfirmDialog(
                null,
                "Answer the following Questions as honestly as possible.",
                "Gay Test",
                2
        );

        if (answer == 0)
        {
            String username = JOptionPane.showInputDialog(
                    null,
                    "So What's your name",
                    "Gay Test",
                    answer
            );
            byte gaylevel = 0;

            Questions question = new Questions();
            // int ans1 = JOptionPane.showInternalConfirmDialog(
            //   null,
            //   question.Question1() + username,
            //   "Gay Test",
            //   1
            // );

            String[] questions = {
                    question.Question1(),
                    question.Question2(),
                    question.Question3(),
                    question.Question4(),
                    question.Question5(),
            };
            String[] yesAnswers = {
                    question.yesAns1(),
                    question.yesAns2(),
                    question.yesAns3(),
                    question.yesAns4(),
                    question.yesAns5(),
            };
            String[] noAnswer = {
                    question.noAns1(),
                    question.noAns2(),
                    question.noAns3(),
                    question.noAns4(),
                    question.noAns5(),
            };

            for (int i = 0; i < questions.length; i++)
            {
                int ans = getQuestion(username + ". " + questions[i]);
                if (ans == 0)
                {
                    setReply(username + ". " + yesAnswers[i]);
                    gaylevel += 1;
                } else if (ans == 1)
                {
                    setReply(username + ". " + noAnswer[i]);
                    gaylevel += 2;
                } else if (ans == 2)
                {
                    JOptionPane.showMessageDialog(
                            null,
                            "so it seems your are qutting the test T_T"
                    );
                    break;
                }
            }
            if (gaylevel <= 5 && answer == 0)
            {
                setReply(username + ", you are pretty much normal...<3");
            } else if (gaylevel > 5 && gaylevel <= 8)
            {
                setReply("Yep " + username + " you are pretty much gay..xd");
            } else if (gaylevel > 8)
            {
                JOptionPane.showInternalInputDialog(
                        null,
                        username + " why are you gay?"
                );
                setReply(username + " You are GAY...");
            }
        }
        if (answer != 0)
        {
            JOptionPane.showMessageDialog(null, "Yes, you are Gay as fuck");
        }
    }
}