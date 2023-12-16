import javax.swing.JOptionPane;

public class GayTester {

  GayTester() {} //default constructor

  static int getQuestion(String x) {
    return (JOptionPane.showInternalConfirmDialog(null, x, "Gay Test", 1));
  }

  static void setReply(String message) {
    JOptionPane.showConfirmDialog(null, message, "Gay Test", 2);
  }

  public static void main(String[] args) {
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

    if (answer == 0) {
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

      for (int i = 0; i < questions.length; i++) {
        int ans = getQuestion(username + ". " + questions[i]);
        if (ans == 0) {
          setReply(username + ". " + yesAnswers[i]);
          gaylevel += 1;
        } else if (ans == 1) {
          setReply(username + ". " + noAnswer[i]);
          gaylevel += 2;
        } else if (ans == 2) {
          JOptionPane.showMessageDialog(
            null,
            "so it seems your are qutting the test T_T"
          );
          break;
        }
      }
      if (gaylevel <= 5 && answer == 0) {
        setReply(username + ", you are pretty much normal...<3");
      } else if (gaylevel > 5 && gaylevel <= 8) {
        setReply("Yep " + username + " you are pretty much gay..xd");
      } else if (gaylevel > 8) {
        JOptionPane.showInternalInputDialog(
          null,
          username + " why are you gay?"
        );
        setReply(username + " You are GAY...");
      }
      // int ans1 = getQuestion(question.Question1() + " " + username);
      // //0 is the index number not the false, instead at 0 index its true so 0 is true;
      // if (ans1 == 0) {
      //   setReply(question.yesAns1());
      //   gaylevel += 1;
      //   int ans2 = getQuestion(username + ". " + question.Question2());
      // }
      // if (ans1 == 1) {
      //   setReply(question.noAns1());
      //   gaylevel += 2;
      //   int ans2 = getQuestion(username + ". " + question.Question2());
      //   if (ans2 == 1) {}
      // }
      // if (ans1 == 2) {
      //   JOptionPane.showMessageDialog(
      //     null,
      //     "so it seems your are qutting the test T_T"
      //   );
      // }
    }
    if (answer != 0) {
      JOptionPane.showMessageDialog(null, "Yes, you are Gay as fuck");
    }
  }
}

class Questions {

  String Question1() {
    return ("Are you Gay?");
  }

  String Question2() {
    return "ever felt, that your homie looks Extra submissive and Bleadable?";
  }

  String Question3() {
    return "Ever spread your butt cheeks by yourself?";
  }

  String Question4() {
    return "Ever tried to suck you own dick?";
  }

  String Question5() {
    return "Ever tried to hold your Mushroom between thighs so that you can see how would you look without the staff?";
  }

  String yesAns1() {
    return "I knew it.";
  }

  String yesAns2() {
    return " hmmmm... dude stay away form me, okay...";
  }

  String yesAns3() {
    return "This not a bruh moment anymore, what the actual fuck is worong with you.";
  }

  String yesAns4() {
    return "well I also did,So no hard feelings okay.";
  }

  String yesAns5() {
    return "Thats some downbad shit, i'll pretend that i haven't done anything like that..";
  }

  String noAns1() {
    return "everyone says 'i am not gay'";
  }

  String noAns2() {
    return "Man you look kinda cute today, lets contiue the test.";
  }

  String noAns3() {
    return "looks like you got a flat ass.";
  }

  String noAns4() {
    return "ok ok i get it (will be a secret between you and me)";
  }

  String noAns5() {
    return "man you'r missing out.";
  }

  Questions() {}
}
