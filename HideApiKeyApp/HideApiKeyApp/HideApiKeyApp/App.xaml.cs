using HideApiKeyApp.Views;
using Newtonsoft.Json.Linq;
using System.IO;
using System.Linq;
using System.Reflection;
using System.Threading.Tasks;
using Xamarin.Forms;

namespace HideApiKeyApp
{
	public partial class App : Application
	{
        public static string RestApiUrl { get; private set; }
        public static string RestApiKey { get; private set; }
        public App()
        {
            InitializeComponent();
            InitializeApp();
        }

        private async void InitializeApp()
        {
            await LoadConfig();
            MainPage = new NavigationPage(new MainPage());
        }

        private static async Task LoadConfig()
        {
            var assembly = Assembly.GetAssembly(typeof(App));
            var resourceNames = assembly.GetManifestResourceNames();
            var configName = resourceNames.FirstOrDefault(s => s.Contains("config.json"));
            using (var stream = assembly.GetManifestResourceStream(configName))
            {
                using (var reader = new StreamReader(stream))
                {
                    var json = await reader.ReadToEndAsync();
                    var dynamicJson = JObject.Parse(json);
                    RestApiUrl = dynamicJson["RestApiUrl"].Value<string>();
                    RestApiKey = dynamicJson["RestApiKey"].Value<string>();
                }
            }
        }

        protected override void OnStart()
		{
		}

		protected override void OnSleep()
		{
		}

		protected override void OnResume()
		{
		}
	}
}
