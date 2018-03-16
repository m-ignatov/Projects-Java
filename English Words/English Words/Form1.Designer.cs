namespace English_Words
{
    partial class Form1
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(Form1));
            this.label1 = new System.Windows.Forms.Label();
            this.enLabel = new System.Windows.Forms.Label();
            this.bgLabel = new System.Windows.Forms.Label();
            this.swapBox = new System.Windows.Forms.PictureBox();
            this.placeholdLabel = new System.Windows.Forms.Label();
            this.nextButton = new System.Windows.Forms.Button();
            this.textBox = new System.Windows.Forms.TextBox();
            this.checkBox = new System.Windows.Forms.PictureBox();
            ((System.ComponentModel.ISupportInitialize)(this.swapBox)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.checkBox)).BeginInit();
            this.SuspendLayout();
            // 
            // label1
            // 
            this.label1.Dock = System.Windows.Forms.DockStyle.Fill;
            this.label1.Font = new System.Drawing.Font("Segoe UI Light", 20F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(204)));
            this.label1.Location = new System.Drawing.Point(0, 0);
            this.label1.Margin = new System.Windows.Forms.Padding(7, 0, 7, 0);
            this.label1.Name = "label1";
            this.label1.Padding = new System.Windows.Forms.Padding(0, 28, 0, 0);
            this.label1.Size = new System.Drawing.Size(752, 431);
            this.label1.TabIndex = 0;
            this.label1.Text = "choose a language:";
            this.label1.TextAlign = System.Drawing.ContentAlignment.TopCenter;
            // 
            // enLabel
            // 
            this.enLabel.AutoSize = true;
            this.enLabel.Font = new System.Drawing.Font("Segoe UI Light", 18F, ((System.Drawing.FontStyle)((System.Drawing.FontStyle.Bold | System.Drawing.FontStyle.Underline))), System.Drawing.GraphicsUnit.Point, ((byte)(204)));
            this.enLabel.ForeColor = System.Drawing.SystemColors.HotTrack;
            this.enLabel.Location = new System.Drawing.Point(457, 87);
            this.enLabel.Margin = new System.Windows.Forms.Padding(7, 0, 7, 0);
            this.enLabel.Name = "enLabel";
            this.enLabel.Size = new System.Drawing.Size(111, 32);
            this.enLabel.TabIndex = 2;
            this.enLabel.Text = "ENGLISH";
            this.enLabel.TextAlign = System.Drawing.ContentAlignment.MiddleRight;
            // 
            // bgLabel
            // 
            this.bgLabel.AutoSize = true;
            this.bgLabel.Font = new System.Drawing.Font("Segoe UI Light", 18F, ((System.Drawing.FontStyle)((System.Drawing.FontStyle.Bold | System.Drawing.FontStyle.Underline))), System.Drawing.GraphicsUnit.Point, ((byte)(204)));
            this.bgLabel.ForeColor = System.Drawing.SystemColors.HotTrack;
            this.bgLabel.Location = new System.Drawing.Point(181, 87);
            this.bgLabel.Margin = new System.Windows.Forms.Padding(7, 0, 7, 0);
            this.bgLabel.Name = "bgLabel";
            this.bgLabel.Size = new System.Drawing.Size(144, 32);
            this.bgLabel.TabIndex = 1;
            this.bgLabel.Text = "BULGARIAN";
            // 
            // swapBox
            // 
            this.swapBox.Image = global::English_Words.Properties.Resources.swap;
            this.swapBox.Location = new System.Drawing.Point(361, 78);
            this.swapBox.Name = "swapBox";
            this.swapBox.Size = new System.Drawing.Size(50, 50);
            this.swapBox.SizeMode = System.Windows.Forms.PictureBoxSizeMode.StretchImage;
            this.swapBox.TabIndex = 3;
            this.swapBox.TabStop = false;
            this.swapBox.Click += new System.EventHandler(this.swapBox_Click);
            this.swapBox.MouseLeave += new System.EventHandler(this.swapBox_MouseLeave);
            this.swapBox.MouseHover += new System.EventHandler(this.swapBox_MouseHover);
            // 
            // placeholdLabel
            // 
            this.placeholdLabel.AutoSize = true;
            this.placeholdLabel.Font = new System.Drawing.Font("Segoe UI Light", 25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(204)));
            this.placeholdLabel.Location = new System.Drawing.Point(122, 192);
            this.placeholdLabel.Name = "placeholdLabel";
            this.placeholdLabel.Size = new System.Drawing.Size(0, 46);
            this.placeholdLabel.TabIndex = 4;
            // 
            // nextButton
            // 
            this.nextButton.Enabled = false;
            this.nextButton.FlatStyle = System.Windows.Forms.FlatStyle.System;
            this.nextButton.Location = new System.Drawing.Point(283, 348);
            this.nextButton.Name = "nextButton";
            this.nextButton.Size = new System.Drawing.Size(198, 55);
            this.nextButton.TabIndex = 5;
            this.nextButton.Text = "Next";
            this.nextButton.UseVisualStyleBackColor = true;
            this.nextButton.Click += new System.EventHandler(this.nextButton_Click);
            // 
            // textBox
            // 
            this.textBox.Location = new System.Drawing.Point(438, 195);
            this.textBox.Name = "textBox";
            this.textBox.Size = new System.Drawing.Size(253, 43);
            this.textBox.TabIndex = 6;
            this.textBox.TextChanged += new System.EventHandler(this.textBox_TextChanged);
            // 
            // checkBox
            // 
            this.checkBox.Image = global::English_Words.Properties.Resources.complete_icon;
            this.checkBox.Location = new System.Drawing.Point(697, 200);
            this.checkBox.Name = "checkBox";
            this.checkBox.Size = new System.Drawing.Size(35, 35);
            this.checkBox.SizeMode = System.Windows.Forms.PictureBoxSizeMode.StretchImage;
            this.checkBox.TabIndex = 7;
            this.checkBox.TabStop = false;
            this.checkBox.Visible = false;
            // 
            // Form1
            // 
            this.AcceptButton = this.nextButton;
            this.AutoScaleDimensions = new System.Drawing.SizeF(14F, 37F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.AutoSizeMode = System.Windows.Forms.AutoSizeMode.GrowAndShrink;
            this.ClientSize = new System.Drawing.Size(752, 431);
            this.Controls.Add(this.checkBox);
            this.Controls.Add(this.textBox);
            this.Controls.Add(this.nextButton);
            this.Controls.Add(this.placeholdLabel);
            this.Controls.Add(this.swapBox);
            this.Controls.Add(this.bgLabel);
            this.Controls.Add(this.enLabel);
            this.Controls.Add(this.label1);
            this.Font = new System.Drawing.Font("Segoe UI Light", 20F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(204)));
            this.Icon = ((System.Drawing.Icon)(resources.GetObject("$this.Icon")));
            this.Margin = new System.Windows.Forms.Padding(7, 9, 7, 9);
            this.MaximizeBox = false;
            this.Name = "Form1";
            this.Text = "English Words";
            ((System.ComponentModel.ISupportInitialize)(this.swapBox)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.checkBox)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Label enLabel;
        private System.Windows.Forms.Label bgLabel;
        private System.Windows.Forms.PictureBox swapBox;
        private System.Windows.Forms.Label placeholdLabel;
        private System.Windows.Forms.Button nextButton;
        private System.Windows.Forms.TextBox textBox;
        private System.Windows.Forms.PictureBox checkBox;

    }
}

