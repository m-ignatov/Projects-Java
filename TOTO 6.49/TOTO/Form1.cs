using System;
using System.ComponentModel;
using System.Windows.Forms;

namespace WindowsFormsApplication3
{
    public partial class Form1 : Form
    {
        BackgroundWorker bgw = new BackgroundWorker();

        public Form1()
        {
            InitializeComponent();
        }

        void Bgw_DoWork(object sender, DoWorkEventArgs e)
        {
            int total = 20;

            for (int i = 0; i <= total; i++)
            {
                System.Threading.Thread.Sleep(25);
                int percents = (i * 100) / total;
                bgw.ReportProgress(percents, i);
            }
        }

        void Bgw_ProgressChanged(object sender, ProgressChangedEventArgs e)
        {
            progressBar1.Value = e.ProgressPercentage;
            label2.Text = String.Format("Статус: {0}%", e.ProgressPercentage);
            //label2.Text = String.Format("Total items transfered: {0}", e.UserState);
            label2.Visible = true;
        }

        void Bgw_RunWorkerCompleted(object sender, RunWorkerCompletedEventArgs e)
        {
            Random r = new Random();

            for (int i = 1; i <= 6; i++)
            {
                int number = r.Next() % 49 + 1;
                listBox1.Items.Add(number);
            }

            bgw.DoWork -= new DoWorkEventHandler(Bgw_DoWork);
            bgw.RunWorkerCompleted -= new RunWorkerCompletedEventHandler(Bgw_RunWorkerCompleted);

            generateButton.Enabled = true;
        }

        private void GenerateButton_Click(object sender, EventArgs e)
        {
            if (progressBar1.Value == 100) { progressBar1.Value = 0; listBox1.Items.Clear(); }

            bgw.DoWork += new DoWorkEventHandler(Bgw_DoWork);
            bgw.ProgressChanged += new ProgressChangedEventHandler(Bgw_ProgressChanged);
            bgw.RunWorkerCompleted += new RunWorkerCompletedEventHandler(Bgw_RunWorkerCompleted);
            bgw.WorkerReportsProgress = true;
            bgw.RunWorkerAsync();

            generateButton.Enabled = false;
        }
    }
}
