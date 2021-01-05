using HideApiKeyApp.ViewModels;
using System;
using Xamarin.Forms;

namespace HideApiKeyApp.Views
{
	public partial class MainPage : ContentPage
	{
		private MainViewModel _viewModel;
		public MainPage()
		{
			InitializeComponent();
			_viewModel = new MainViewModel();
			BindingContext = _viewModel;
		}
		
		private void Show_Button_Clicked(object sender, EventArgs e) => _viewModel.OnShowApiKey();
	}
}