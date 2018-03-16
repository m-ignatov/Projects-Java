using System;
using System.Drawing;
using System.Windows.Forms;

namespace Figures
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            if (this.comboBox1.SelectedItem.Equals("Правоъгълник"))
            {
                webBrowser1.Navigate("http://bg.m.wikipedia.org/wiki/%D0%9F%D1%80%D0%B0%D0%B2%D0%BE%D1%8A%D0%B3%D1%8A%D0%BB%D0%BD%D0%B8%D0%BA");

                Graphics s = this.CreateGraphics();
                s.Clear(Color.White);
                s.Dispose();

                SolidBrush myBrush = new SolidBrush(Color.Green);
                Graphics formGraphics = this.CreateGraphics();
                formGraphics.FillRectangle(myBrush, new Rectangle(40, 110, 240, 150));

                myBrush.Dispose();
                formGraphics.Dispose();
            }

            if (this.comboBox1.SelectedItem.ToString() == "Триъгълник")
            {
                webBrowser1.Navigate("http://bg.m.wikipedia.org/wiki/%D0%A2%D1%80%D0%B8%D1%8A%D0%B3%D1%8A%D0%BB%D0%BD%D0%B8%D0%BA");

                Graphics s = this.CreateGraphics();
                s.Clear(Color.White);
                s.Dispose();

                Graphics g = this.CreateGraphics();
                Pen p = new Pen(Color.Green);

                g.FillPolygon(Brushes.Green, new Point[3] { new Point(50, 310), new Point(130, 100), new Point(210, 310) });
                g.Dispose();
            }

            if (this.comboBox1.SelectedItem.ToString() == "Кръг")
            {
                webBrowser1.Navigate("http://bg.m.wikipedia.org/wiki/%D0%9E%D0%BA%D1%80%D1%8A%D0%B6%D0%BD%D0%BE%D1%81%D1%82");

                Graphics s = this.CreateGraphics();
                s.Clear(Color.White);
                s.Dispose();
                Graphics g = this.CreateGraphics();

                Pen p = new Pen(Color.Green, 2);
                g.FillEllipse(Brushes.Green, 50, 100, 200, 200);
                g.Dispose();
            }
        }
    }
}
