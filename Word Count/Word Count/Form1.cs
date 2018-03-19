using System;
using System.Windows.Forms;

namespace Word_Count
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
            this.ActiveControl = richTextBox1;
        }

        private void RichTextBox1_TextChanged(object sender, EventArgs e)
        {
            String text = richTextBox1.Text;

            bool flag = false;
            int index = 0;
            int wordCount = 0;

            while (index < text.Length)
            {
                while (index < text.Length && Char.IsWhiteSpace(text[index])) index++;
                while (index < text.Length && !Char.IsWhiteSpace(text[index]))
                {
                    flag = true;
                    index++;
                }

                if (flag)
                {
                    wordCount++;
                    flag = false;
                }
            }
            label1.Text = "Words: " + wordCount;
        }

        private void EnterButton_Click(object sender, EventArgs e)
        {
            if (richTextBox1.Text.Trim().Length > 0)
            {
                string s = richTextBox1.Text;
                string t = "";
                int len = s.Length - 1;

                for (int i = len; i >= 0; i--)
                {
                    t += s[i];
                }
                MessageBox.Show("Reversed Text:\n" + t, "Information", MessageBoxButtons.OK, MessageBoxIcon.Information, MessageBoxDefaultButton.Button1);
                ClearButton_Click(sender, e);
            }
        }

        private void ClearButton_Click(object sender, EventArgs e)
        {
            richTextBox1.Clear();
            label1.Text = "Words: 0";
        }
    }
}

