INSERT INTO restaurant(id, name_) VALUES (0, 'Горбушкин двор');
INSERT INTO restaurant(id, name_) VALUES (1, 'Hot girls');
INSERT INTO restaurant(id, name_) VALUES (2, 'Sweet boys');
INSERT INTO restaurant(id, name_) VALUES (3, 'Fast eagle');
INSERT INTO restaurant(id, name_) VALUES (4, 'Дикий кайот');

INSERT INTO public.daily_menu(id, date_, restaurant_id) VALUES (10, now(), 0);
INSERT INTO public.daily_menu(id, date_, restaurant_id) VALUES (11, now(), 1);
INSERT INTO public.daily_menu(id, date_, restaurant_id) VALUES (12, now(), 2);
INSERT INTO public.daily_menu(id, date_, restaurant_id) VALUES (13, now(), 3);
INSERT INTO public.daily_menu(id, date_, restaurant_id) VALUES (14, now(), 4);

INSERT INTO public.menu_item(id, dishname, price, daily_menu_id) VALUES (20, 'Первое', 250, 10);
INSERT INTO public.menu_item(id, dishname, price, daily_menu_id) VALUES (21, 'Второе', 350, 10);
INSERT INTO public.menu_item(id, dishname, price, daily_menu_id) VALUES (22, 'Овсяночка', 50, 10);

INSERT INTO public.menu_item(id, dishname, price, daily_menu_id) VALUES (23, 'Борщец', 1080, 11);
INSERT INTO public.menu_item(id, dishname, price, daily_menu_id) VALUES (24, 'Пицца', 250, 11);
INSERT INTO public.menu_item(id, dishname, price, daily_menu_id) VALUES (25, 'Вино', 250, 11);

INSERT INTO public.menu_item(id, dishname, price, daily_menu_id) VALUES (26, 'Борщец', 180, 12);
INSERT INTO public.menu_item(id, dishname, price, daily_menu_id) VALUES (27, 'Пицца', 25, 12);
INSERT INTO public.menu_item(id, dishname, price, daily_menu_id) VALUES (28, 'Вино', 22, 12);

INSERT INTO public.menu_item(id, dishname, price, daily_menu_id) VALUES (29, 'Борщец', 1800, 13);
INSERT INTO public.menu_item(id, dishname, price, daily_menu_id) VALUES (30, 'Пицца', 2500, 13);
INSERT INTO public.menu_item(id, dishname, price, daily_menu_id) VALUES (31, 'Вино', 22, 14);