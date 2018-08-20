import { AngularWebSiteInstitucionalPage } from './app.po';

describe('angular-web-site-institucional App', () => {
  let page: AngularWebSiteInstitucionalPage;

  beforeEach(() => {
    page = new AngularWebSiteInstitucionalPage();
  });

  it('should display welcome message', () => {
    page.navigateTo();
    expect(page.getParagraphText()).toEqual('Welcome to app!!');
  });
});
