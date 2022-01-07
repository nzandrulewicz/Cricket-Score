package com.example.cricketscore;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
//import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    TextView showTick120, showTick119, showTick118, showTick117, showTick116, showTick115, showTick1Bulls, team1Score;
    int giCounter120, giCounter119, giCounter118, giCounter117, giCounter116, giCounter115, giCounter1Bulls = 0;
    
    TextView showTick220, showTick219, showTick218, showTick217, showTick216, showTick215, showTick2Bulls;
    int giCounter220, giCounter219, giCounter218, giCounter217, giCounter216, giCounter215, giCounter2Bulls = 0;

    List<Integer> gaHistory = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TEAM 1
        showTick120 = (TextView) findViewById(R.id.tick120);
        showTick119 = (TextView) findViewById(R.id.tick119);
        showTick118 = (TextView) findViewById(R.id.tick118);
        showTick117 = (TextView) findViewById(R.id.tick117);
        showTick116 = (TextView) findViewById(R.id.tick116);
        showTick115 = (TextView) findViewById(R.id.tick115);
        showTick1Bulls = (TextView) findViewById(R.id.tick1Bulls);

        // TEAM 2
        showTick220 = (TextView) findViewById(R.id.tick220);
        showTick219 = (TextView) findViewById(R.id.tick219);
        showTick218 = (TextView) findViewById(R.id.tick218);
        showTick217 = (TextView) findViewById(R.id.tick217);
        showTick216 = (TextView) findViewById(R.id.tick216);
        showTick215 = (TextView) findViewById(R.id.tick215);
        showTick2Bulls = (TextView) findViewById(R.id.tick2Bulls);
    }


    public void onClick(View view)
    {
        int buttonID = view.getId();
        System.out.println(buttonID); // DELETE LATER. THIS SHOWS BUTTON'S ID INTEGER
        updateScore(buttonID);
    }

    public void onClickUndo(View view)
    {
        int buttonID = view.getId(); // UNDO BUTTON ID: 2131231166
        // System.out.println(buttonID);
        updateScore(buttonID);
    }

    public void updateScore(int piButtonID) {

        // Undo Score Button
        if (piButtonID == 2131231166) {
            int iLastElement = gaHistory.get(gaHistory.size() - 1);

            // TEAM 1 UNDOs
            if (iLastElement == 2131230812) {
                gaHistory.remove(gaHistory.size() - 1);
                System.out.println(gaHistory);
                giCounter120--;

                if (giCounter120 == 0) {
                    showTick120.setText("");
                } else if (giCounter120 == 1) {
                    showTick120.setText("/");
                } else if (giCounter120 == 2) {
                    showTick120.setText("X");
                } else if (giCounter120 == 3) {
                    showTick120.setText("O");
                }
            }

            if (iLastElement == 2131230811) {
                {
                    giCounter119--;
                    gaHistory.remove(gaHistory.size() - 1);
                    System.out.println(gaHistory);

                    if (giCounter119 == 0) {
                        showTick119.setText("");
                    } else if (giCounter119 == 1) {
                        showTick119.setText("/");
                    } else if (giCounter119 == 2) {
                        showTick119.setText("X");
                    } else if (giCounter119 == 3) {
                        showTick119.setText("O");
                    }
                }
            }

            if (iLastElement == 2131230810) {
                giCounter118--;
                gaHistory.remove(gaHistory.size() - 1);
                System.out.println(gaHistory);

                if (giCounter118 == 0) {
                    showTick118.setText("");
                } else if (giCounter118 == 1) {
                    showTick118.setText("/");
                } else if (giCounter118 == 2) {
                    showTick118.setText("X");
                } else if (giCounter118 == 3) {
                    showTick118.setText("O");
                }
            }

            if (iLastElement == 2131230809) {
                giCounter117--;
                gaHistory.remove(gaHistory.size() - 1);
                System.out.println(gaHistory);

                if (giCounter117 == 0) {
                    showTick117.setText("");
                } else if (giCounter117 == 1) {
                    showTick117.setText("/");
                } else if (giCounter117 == 2) {
                    showTick117.setText("X");
                } else if (giCounter117 == 3) {
                    showTick117.setText("O");
                }
            }

            if (iLastElement == 2131230808) {
                giCounter116--;
                gaHistory.remove(gaHistory.size() - 1);
                System.out.println(gaHistory);

                if (giCounter116 == 0) {
                    showTick116.setText("");
                } else if (giCounter116 == 1) {
                    showTick116.setText("/");
                } else if (giCounter116 == 2) {
                    showTick116.setText("X");
                } else if (giCounter116 == 3) {
                    showTick116.setText("O");
                }
            }

            if (iLastElement == 2131230807) {
                giCounter115--;
                gaHistory.remove(gaHistory.size() - 1);
                System.out.println(gaHistory);

                if (giCounter115 == 0) {
                    showTick115.setText("");
                } else if (giCounter115 == 1) {
                    showTick115.setText("/");
                } else if (giCounter115 == 2) {
                    showTick115.setText("X");
                } else if (giCounter115 == 3) {
                    showTick115.setText("O");
                }
            }

            if (iLastElement == 2131230813) {
                giCounter1Bulls--;
                gaHistory.remove(gaHistory.size() - 1);
                System.out.println(gaHistory);

                if (giCounter1Bulls == 0) {
                    showTick1Bulls.setText("");
                } else if (giCounter1Bulls == 1) {
                    showTick1Bulls.setText("/");
                } else if (giCounter1Bulls == 2) {
                    showTick1Bulls.setText("X");
                } else if (giCounter1Bulls == 3) {
                    showTick1Bulls.setText("O");
                }
            }

            // TEAM 2 UNDOs
            if (iLastElement == 2131230819) {
                gaHistory.remove(gaHistory.size() - 1);
                System.out.println(gaHistory);
                giCounter220--;

                if (giCounter220 == 0) {
                    showTick220.setText("");
                } else if (giCounter220 == 1) {
                    showTick220.setText("/");
                } else if (giCounter220 == 2) {
                    showTick220.setText("X");
                } else if (giCounter220 == 3) {
                    showTick220.setText("O");
                }
            }

            if (iLastElement == 2131230818) {
                gaHistory.remove(gaHistory.size() - 1);
                System.out.println(gaHistory);
                giCounter219--;

                if (giCounter219 == 0) {
                    showTick219.setText("");
                } else if (giCounter219 == 1) {
                    showTick219.setText("/");
                } else if (giCounter219 == 2) {
                    showTick219.setText("X");
                } else if (giCounter219 == 3) {
                    showTick219.setText("O");
                }
            }

            if (iLastElement == 2131230817) {
                gaHistory.remove(gaHistory.size() - 1);
                System.out.println(gaHistory);
                giCounter218--;

                if (giCounter218 == 0) {
                    showTick218.setText("");
                } else if (giCounter218 == 1) {
                    showTick218.setText("/");
                } else if (giCounter218 == 2) {
                    showTick218.setText("X");
                } else if (giCounter218 == 3) {
                    showTick218.setText("O");
                }
            }

            if (iLastElement == 2131230816) {
                gaHistory.remove(gaHistory.size() - 1);
                System.out.println(gaHistory);
                giCounter217--;

                if (giCounter217 == 0) {
                    showTick217.setText("");
                } else if (giCounter217 == 1) {
                    showTick217.setText("/");
                } else if (giCounter217 == 2) {
                    showTick217.setText("X");
                } else if (giCounter217 == 3) {
                    showTick217.setText("O");
                }
            }

            if (iLastElement == 2131230815) {
                gaHistory.remove(gaHistory.size() - 1);
                System.out.println(gaHistory);
                giCounter216--;

                if (giCounter216 == 0) {
                    showTick216.setText("");
                } else if (giCounter216 == 1) {
                    showTick216.setText("/");
                } else if (giCounter216 == 2) {
                    showTick216.setText("X");
                } else if (giCounter216 == 3) {
                    showTick216.setText("O");
                }
            }

            if (iLastElement == 2131230814) {
                gaHistory.remove(gaHistory.size() - 1);
                System.out.println(gaHistory);
                giCounter215--;

                if (giCounter215 == 0) {
                    showTick215.setText("");
                } else if (giCounter215 == 1) {
                    showTick215.setText("/");
                } else if (giCounter215 == 2) {
                    showTick215.setText("X");
                } else if (giCounter215 == 3) {
                    showTick215.setText("O");
                }
            }

            if (iLastElement == 2131230820) {
                gaHistory.remove(gaHistory.size() - 1);
                System.out.println(gaHistory);
                giCounter2Bulls--;

                if (giCounter2Bulls == 0) {
                    showTick2Bulls.setText("");
                } else if (giCounter2Bulls == 1) {
                    showTick2Bulls.setText("/");
                } else if (giCounter2Bulls == 2) {
                    showTick2Bulls.setText("X");
                } else if (giCounter2Bulls == 3) {
                    showTick2Bulls.setText("O");
                }
            }
        }

        // Add Score Buttons
        // TEAM 1
        if (piButtonID == 2131230812) {
            giCounter120++;
            gaHistory.add(piButtonID);

            System.out.println(gaHistory);

            if (giCounter120 == 1) {
                showTick120.setText("/");
            } else if (giCounter120 == 2) {
                showTick120.setText("X");
            } else if (giCounter120 == 3) {
                showTick120.setText("O");
            }
        }

        if (piButtonID == 2131230811) {
            giCounter119++;
            gaHistory.add(piButtonID);
            System.out.println(gaHistory);

            if (giCounter119 == 1) {
                showTick119.setText("/");
            } else if (giCounter119 == 2) {
                showTick119.setText("X");
            } else if (giCounter119 == 3) {
                showTick119.setText("O");
            }
        }


        if (piButtonID == 2131230810) {
            giCounter118++;
            gaHistory.add(piButtonID);
            System.out.println(gaHistory);

            if (giCounter118 == 1) {
                showTick118.setText("/");
            } else if (giCounter118 == 2) {
                showTick118.setText("X");
            } else if (giCounter118 == 3) {
                showTick118.setText("O");
            }
        }

        if (piButtonID == 2131230809) {
            giCounter117++;
            gaHistory.add(piButtonID);
            System.out.println(gaHistory);

            if (giCounter117 == 1) {
                showTick117.setText("/");
            } else if (giCounter117 == 2) {
                showTick117.setText("X");
            } else if (giCounter117 == 3) {
                showTick117.setText("O");
            }
        }

        if (piButtonID == 2131230808) {
            giCounter116++;
            gaHistory.add(piButtonID);
            System.out.println(gaHistory);

            if (giCounter116 == 1) {
                showTick116.setText("/");
            } else if (giCounter116 == 2) {
                showTick116.setText("X");
            } else if (giCounter116 == 3) {
                showTick116.setText("O");
            }
        }

        if (piButtonID == 2131230807) {
            giCounter115++;
            gaHistory.add(piButtonID);
            System.out.println(gaHistory);

            if (giCounter115 == 1) {
                showTick115.setText("/");
            } else if (giCounter115 == 2) {
                showTick115.setText("X");
            } else if (giCounter115 == 3) {
                showTick115.setText("O");
            }
        }

        if (piButtonID == 2131230813) {
            giCounter1Bulls++;
            gaHistory.add(piButtonID);
            System.out.println(gaHistory);

            if (giCounter1Bulls == 1) {
                showTick1Bulls.setText("/");
            } else if (giCounter1Bulls == 2) {
                showTick1Bulls.setText("X");
            } else if (giCounter1Bulls == 3) {
                showTick1Bulls.setText("O");
            }
        }

        // TEAM 2
        if (piButtonID == 2131230819) {
            giCounter220++;
            gaHistory.add(piButtonID);
            System.out.println(gaHistory);

            if (giCounter220 == 1) {
                showTick220.setText("/");
            } else if (giCounter220 == 2) {
                showTick220.setText("X");
            } else if (giCounter220 == 3) {
                showTick220.setText("O");
            }
        }

        if (piButtonID == 2131230818) {
            giCounter219++;
            gaHistory.add(piButtonID);
            System.out.println(gaHistory);

            if (giCounter219 == 1) {
                showTick219.setText("/");
            } else if (giCounter219 == 2) {
                showTick219.setText("X");
            } else if (giCounter219 == 3) {
                showTick219.setText("O");
            }
        }

        if (piButtonID == 2131230817) {
            giCounter218++;
            gaHistory.add(piButtonID);
            System.out.println(gaHistory);

            if (giCounter218 == 1) {
                showTick218.setText("/");
            } else if (giCounter218 == 2) {
                showTick218.setText("X");
            } else if (giCounter218 == 3) {
                showTick218.setText("O");
            }
        }

        if (piButtonID == 2131230816) {
            giCounter217++;
            gaHistory.add(piButtonID);
            System.out.println(gaHistory);

            if (giCounter217 == 1) {
                showTick217.setText("/");
            } else if (giCounter217 == 2) {
                showTick217.setText("X");
            } else if (giCounter217 == 3) {
                showTick217.setText("O");
            }
        }

        if (piButtonID == 2131230815) {
            giCounter216++;
            gaHistory.add(piButtonID);
            System.out.println(gaHistory);

            if (giCounter216 == 1) {
                showTick216.setText("/");
            } else if (giCounter216 == 2) {
                showTick216.setText("X");
            } else if (giCounter216 == 3) {
                showTick216.setText("O");
            }
        }

        if (piButtonID == 2131230814) {
            giCounter215++;
            gaHistory.add(piButtonID);
            System.out.println(gaHistory);

            if (giCounter215 == 1) {
                showTick215.setText("/");
            } else if (giCounter215 == 2) {
                showTick215.setText("X");
            } else if (giCounter215 == 3) {
                showTick215.setText("O");

            }
        }

        if (piButtonID == 2131230820) {
            giCounter2Bulls++;
            gaHistory.add(piButtonID);
            System.out.println(gaHistory);

            if (giCounter2Bulls == 1) {
                showTick2Bulls.setText("/");
            } else if (giCounter2Bulls == 2) {
                showTick2Bulls.setText("X");
            } else if (giCounter2Bulls == 3) {
                showTick2Bulls.setText("O");
            }
        }
    }
}
