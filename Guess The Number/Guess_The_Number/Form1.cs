using System;
using System.Windows.Forms;

namespace Guess_The_Number
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void guessButton_Click(object sender, EventArgs e)
        {
            int sum = 0;

            if (checkBox1.Checked) sum += 1;
            if (checkBox2.Checked) sum += 2;
            if (checkBox3.Checked) sum += 4;
            if (checkBox4.Checked) sum += 8;
            if (checkBox5.Checked) sum += 16;

            if (sum == 0) MessageBox.Show("Вие не си намислихте число!", "Информация", MessageBoxButtons.OK, MessageBoxIcon.Warning, MessageBoxDefaultButton.Button1);
            else MessageBox.Show("Вие си намислихте числото " + Convert.ToString(sum), "Информация", MessageBoxButtons.OK, MessageBoxIcon.Information, MessageBoxDefaultButton.Button1);

            checkBox1.Checked = false;
            checkBox2.Checked = false;
            checkBox3.Checked = false;
            checkBox4.Checked = false;
            checkBox5.Checked = false;
        }
    }
}
