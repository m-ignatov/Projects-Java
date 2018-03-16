using System;
using System.Windows.Forms;

namespace English_Words
{
    public partial class Form1 : Form
    {
        public int fromBG = 1, size = 0, ind, br = 0, i;
        static bool[] used = new bool[2000000];
        static string[] list = new string[2000000];

        public Form1()
        {
            InitializeComponent();
            System.IO.StreamReader file = new System.IO.StreamReader(@"data.txt");
            while ((list[size] = file.ReadLine()) != null) System.Console.WriteLine(list[size++]);
            file.Close();

            generateWord();
        }


        void check()
        {
            if (fromBG == 1)
            {
                if ((ind & 1) == 0) ind++;
            }
            else
            {
                if ((ind & 1) == 1) ind--;
            }
        }

        void generateWord()
        {
            br++;
            Random r = new Random();
            ind = r.Next(0, size);
            check();

            while (used[ind])
            {
                ind = r.Next(0, size);
                check();
            }

            used[ind] = true;
            placeholdLabel.Text = list[ind];
        }

        void swap(Label a, Label b)
        {
            string tmp = a.Text;
            a.Text = b.Text;
            b.Text = tmp;
        }


        private void swapBox_MouseHover(object sender, EventArgs e)
        {
            swapBox.Image = English_Words.Properties.Resources.swap_click;
        }

        private void swapBox_MouseLeave(object sender, EventArgs e)
        {
            swapBox.Image = English_Words.Properties.Resources.swap;
        }

        private void swapBox_Click(object sender, EventArgs e)
        {
            swap(bgLabel, enLabel);
            fromBG ^= 1;

            br = 0;
            Array.Clear(used, 0, size);

            checkBox.Visible = false;
            textBox.Enabled = true;
            textBox.Focus();
            nextButton.Enabled = false;
            textBox.Clear();
            generateWord();
        }

        private void nextButton_Click(object sender, EventArgs e)
        {
            if (br >= size / 2)
            {
                MessageBox.Show("End of Words.", "English Words", MessageBoxButtons.OK, MessageBoxIcon.Information);
                nextButton.Enabled = false;
                return;
            }
            checkBox.Visible = false;
            textBox.Enabled = true;
            textBox.Focus();
            nextButton.Enabled = false;
            textBox.Clear();
            generateWord();
        }

        private void textBox_TextChanged(object sender, EventArgs e)
        {
            i = ind;
            if (fromBG == 1) i--;
            else i++;

            if (textBox.Text == list[i])
            {
                checkBox.Visible = true;
                textBox.Enabled = false;
                nextButton.Enabled = true;
            }
        }
    }
}
