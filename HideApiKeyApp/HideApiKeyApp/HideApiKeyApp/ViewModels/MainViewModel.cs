namespace HideApiKeyApp.ViewModels
{
	class MainViewModel : BaseViewModel
	{
		private string _restApiUrl;
		public string RestApiUrl
		{
			get => _restApiUrl;
			set => SetProperty(ref _restApiUrl, value);
		}

		private string _restApiKey;
		public string RestApiKey
		{
			get => _restApiKey;
			set => SetProperty(ref _restApiKey, value);
		}

		public void OnShowApiKey() {
			RestApiUrl = App.RestApiUrl;
			RestApiKey = App.RestApiKey;
		}
	}
}